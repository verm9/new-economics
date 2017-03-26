package com.verm9.ne.ds.eth;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.verm9.ne.ds.GetCurrentData;
import com.verm9.ne.ds.model.whattomine.Ethereum;
import com.verm9.ne.ds.model.whattomine.WhatToMinePojo;
import com.verm9.ne.repository.model.Coin;
import com.verm9.ne.repository.model.EthCoin;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by verm9 on 2/21/2017.
 */
@Component("getEthCurrentDataImpl")
public class GetEthCurrentDataImpl implements GetCurrentData {

    public static final String HTTP_WHATTOMINE_COM_COINS_JSON = "http://whattomine.com/coins.json";
    @Autowired
    @Qualifier("ethCoin")
    private Coin coin;

    /**
     * Gets data from external resources for this moment of time.
     * Data source is http://whattomine.com/coins.json
     * POJO structure created by http://www.jsonschema2pojo.org
     */
    @Override
    public EthCoin get() {
        // Get JSON
        String jsonInString = null;
        try {
            jsonInString = Jsoup.connect(HTTP_WHATTOMINE_COM_COINS_JSON).ignoreContentType(true)
                    .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36")
                    .execute()
                    .body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // JSON from String to Object
        WhatToMinePojo whatToMinePojo = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            whatToMinePojo = mapper.readValue(jsonInString, WhatToMinePojo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        EthCoin result = new EthCoin();
        Ethereum ethereumPojo = whatToMinePojo.getCoins().getEthereum();

        List<Coin.Timepoint> timepoints = new LinkedList<>();
        timepoints.add(  new EthCoin.EthTimepoint( LocalDateTime.ofInstant(Instant.ofEpochSecond(ethereumPojo.getTimestamp()), ZoneId.systemDefault()),
                ethereumPojo.getExchangeRate24(),
                Double.valueOf(ethereumPojo.getNethash()) )  );
        result.setTimepoints(timepoints);

        return result;
    }
}
