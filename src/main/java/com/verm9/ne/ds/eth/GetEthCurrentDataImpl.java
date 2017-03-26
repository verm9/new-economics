package com.verm9.ne.ds.eth;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.verm9.ne.ds.GetCurrentData;
import com.verm9.ne.ds.model.whattomine.Ethereum;
import com.verm9.ne.ds.model.whattomine.WhatToMinePojo;
import com.verm9.ne.repository.model.EthCoin;
import com.verm9.ne.repository.model.EthTimepoint;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by verm9 on 2/21/2017
 */
@Component("getEthCurrentDataImpl")
public class GetEthCurrentDataImpl implements GetCurrentData {

    public static final String HTTP_WHATTOMINE_COM_COINS_JSON = "http://whattomine.com/coins.json";

    private EthCoin coin;

    /**
     * Gets data from external resources for this moment of time.
     * Data source is http://whattomine.com/coins.json
     * POJO structure created by http://www.jsonschema2pojo.org
     */
    @Override
    public EthTimepoint getTimepoint() {
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

        EthTimepoint result;
        Ethereum ethereumPojo = whatToMinePojo.getCoins().getEthereum();

        result = new EthTimepoint( ethereumPojo.getTimestamp(),
                ethereumPojo.getExchangeRate24(),
                Double.valueOf(ethereumPojo.getNethash()) );

        return result;
    }
}
