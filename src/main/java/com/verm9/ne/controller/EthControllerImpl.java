package com.verm9.ne.controller;

import com.verm9.ne.repository.model.BtcTimepoint;
import com.verm9.ne.repository.model.EthTimepoint;
import com.verm9.ne.repository.model.Profit;
import com.verm9.ne.service.BtcServiceImpl;
import com.verm9.ne.service.EthServiceImpl;
import org.apache.commons.math3.util.Precision;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger LOG = LoggerFactory.getLogger(EthControllerImpl.class);

    @Autowired
    private EthServiceImpl ethService;

    @Autowired
    private BtcServiceImpl btcService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<EthTimepoint> getAllTimepoints() {
        return (Collection<EthTimepoint>) ethService.getAllTimepoints();
    }

    @RequestMapping(path="/save", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveCurrentData(HttpServletResponse response) throws IOException {
        ethService.saveCurrentData();
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
        LOG.info("The doCalculationsForAMonth controller has been accessed");
        Profit result = new Profit();

        // Calculate crypto currency gained for a Month
        double blocksPerMonth = 60*60*24*30 / blockTime;
        double discoveredBlocksByMe = blocksPerMonth * (gpuHashrate * 1_000_000 /* in MH/s*/ / netHashRate);
        double cryptoCoinsGained = discoveredBlocksByMe * blockReward;
        double rubWastedForWatts = gpuWatt/1000 * wattPriceInRub * 24 * 30;
        double cryptoCoinsWastedForWatts = rubWastedForWatts / usdToRub / btcToUsd / cryptoCurrencyToBtc;
        double clearProfitInCryptoCoins = (cryptoCoinsGained - cryptoCoinsWastedForWatts) * (1-fees/100);
        double profitInRub = clearProfitInCryptoCoins * cryptoCurrencyToBtc * btcToUsd * usdToRub;

        result.setProfitInCryptoCurrency( Precision.round(clearProfitInCryptoCoins,4) );
        result.setProfitInBtc( Precision.round(clearProfitInCryptoCoins * cryptoCurrencyToBtc, 4) );
        result.setProfitInUsd( Precision.round(clearProfitInCryptoCoins * cryptoCurrencyToBtc * btcToUsd, 2) );
        result.setProfitInRub( Precision.round(profitInRub,0) );
        result.setWastedPowerInRub( Precision.round(rubWastedForWatts, 0) );
        result.setRoiDays(gpuPrice / (profitInRub / 30) );
        return result;
    }
	
    @RequestMapping(path="/calcRoiForTheTime", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Double doCalculationsForAMonth(
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
            @RequestParam(value = "fees") double fees, // percent
            @RequestParam(value = "timestamp") long timestamp) { 
        Profit profit = new Profit();

        // Get the closest to the passed timestamp.
        EthTimepoint ethTimepoint = ethService.getClosestTimepoint(timestamp/1000); // We got timestamp in millis from the UI
        netHashRate = ethTimepoint.getTotalHashRate();
        cryptoCurrencyToBtc = ethTimepoint.getPrice();

        BtcTimepoint btcTimepoint = btcService.getClosestTimepoint(timestamp/1000); // We got timestamp in millis from the UI
        btcToUsd = btcTimepoint.getPrice();

        // Calculate crypto currency gained for a Month
        double blocksPerMonth = 60*60*24*30 / blockTime;
        double discoveredBlocksByMe = blocksPerMonth * (gpuHashrate * 1_000_000 /* in MH/s*/ / netHashRate); 
        double cryptoCoinsGained = discoveredBlocksByMe * blockReward;
        double rubWastedForWatts = gpuWatt/1000 * wattPriceInRub * 24 * 30;
        double cryptoCoinsWastedForWatts = rubWastedForWatts / usdToRub / btcToUsd / cryptoCurrencyToBtc;
        double clearProfitInCryptoCoins = (cryptoCoinsGained - cryptoCoinsWastedForWatts) * (1-fees/100);
        double profitInRub = clearProfitInCryptoCoins * cryptoCurrencyToBtc * btcToUsd * usdToRub;

        profit.setProfitInCryptoCurrency( Precision.round(clearProfitInCryptoCoins,4) );
        profit.setProfitInBtc( Precision.round(clearProfitInCryptoCoins * cryptoCurrencyToBtc, 4) );
        profit.setProfitInUsd( Precision.round(clearProfitInCryptoCoins * cryptoCurrencyToBtc * btcToUsd, 2) );
        profit.setProfitInRub( Precision.round(profitInRub,0) );
        profit.setWastedPowerInRub( Precision.round(rubWastedForWatts, 0) );
        profit.setRoiDays(gpuPrice / (profitInRub / 30) );
        return profit.getRoiDays();
    }

}