package com.verm9.ne.controller;

import com.verm9.ne.repository.model.Coin.Timepoint;
import com.verm9.ne.repository.model.Profit;
import com.verm9.ne.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

/**
 * Created by verm on 3/5/2017
 */
@RestController
@RequestMapping("/eth")
public class EthControllerImpl implements CoinController {
    @Autowired
    private CoinService service;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Timepoint> getAllTimepoints() {
        System.out.println();
        return service.getAllTimepoints();
    }

    @RequestMapping(path="/save", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveCurrentData(HttpServletResponse response) throws IOException {
        service.saveCurrentData();
        response.sendRedirect("/eth");
    }

    @RequestMapping(path="/doCalculationsForAMonth", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Profit doCalculationsForAMonth(
            @RequestParam(value = "netHashRate") double netHashRate,
            @RequestParam(value = "blockTime") double blockTime, // in seconds
            @RequestParam(value = "blockReward") double blockReward,
            @RequestParam(value = "gpuPrice") double gpuPrice,
            @RequestParam(value = "gpuHashrate") double gpuHashrate,
            @RequestParam(value = "gpuWatt") double gpuWatt,
            @RequestParam(value = "wattPriceInRub") double wattPriceInRub, // for a KW/h
            @RequestParam(value = "cryptoCurrencyToBtc") double cryptoCurrencyToBtc,
            @RequestParam(value = "btcToUsd") double btcToUsd,
            @RequestParam(value = "usdToRub") double usdToRub,
            @RequestParam(value = "fees") double fees) { // percent
        Profit result = new Profit();

        // Calculate crypto currency gained for a Month
        double blocksPerMonth = 60*60*24*30 / blockTime;
        double discoveredBlocksByMe = blocksPerMonth * (gpuHashrate * 1_000_000 /* in MH/s*/ / netHashRate);
        double cryptoCoinsGained = discoveredBlocksByMe * blockReward;
        double rubWastedForWatts = gpuWatt/1000 * wattPriceInRub * 24 * 30;
        double cryptoCoinsWastedForWatts = rubWastedForWatts / usdToRub / btcToUsd / cryptoCurrencyToBtc;
        double clearProfitInCryptoCoins = (cryptoCoinsGained - cryptoCoinsWastedForWatts) * (1-fees/100);
        double profitInRub = clearProfitInCryptoCoins * cryptoCurrencyToBtc * btcToUsd * usdToRub;

        result.setProfitInCryptoCurrency(clearProfitInCryptoCoins);
        result.setProfitInBtc(clearProfitInCryptoCoins * cryptoCurrencyToBtc);
        result.setProfitInUsd(clearProfitInCryptoCoins * cryptoCurrencyToBtc * btcToUsd);
        result.setProfitInRub(profitInRub);
        result.setWastedPowerInRub(rubWastedForWatts);
        result.setRoiDays(gpuPrice / (profitInRub / 30) );
        return result;
    }

}
