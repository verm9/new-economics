package com.verm9.ne.ds;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.verm9.ne.ds.eth.GetEthCurrentDataImpl;
import com.verm9.ne.ds.model.whattominecoins.WhatToMineCoinsPojo;
import com.verm9.ne.service.EthServiceImpl;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by verm on 4/23/2017
 * Data service that provides data on non-asic coins.
 */
@Component
public class WhattomineCoinsDs implements GetCurrentData {

    public static final String HTTP_WHATTOMINE_COM_COINS_JSON = "http://whattomine.com/coins.json";

    @Autowired
    private EthServiceImpl ethRepo;
    @Autowired
    @Qualifier("getEthCurrentDataImpl")
    private GetEthCurrentDataImpl dsEth;

    /**
     * Do not perform saving.
     * @return POJO with all data on coins on the WhatToMine.
     */
    @Override
    public Object getTimepoint() {
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
        WhatToMineCoinsPojo whatToMineCoinsPojo = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            whatToMineCoinsPojo = mapper.readValue(jsonInString, WhatToMineCoinsPojo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return whatToMineCoinsPojo;
    }

    /**
     * Saves all gained data from the WhatToMine but not the Coin in param.
     * It is done to avoid double saving from the service (from where the current
     * method is intended to be called)
     * @param coin will not save data related to this coin
     * @return whatToMine pojo with data on every coin it contains.
     */
    public Object getTimepoint(Coin coin) {
        WhatToMineCoinsPojo timepoint = (WhatToMineCoinsPojo) getTimepoint();

        // save all gained data (but not on the Coin in arg)
        if (!Coin.ETH.equals(coin)) {
            ethRepo.saveData( dsEth.getTimepointFromGeneralPojo(timepoint) );
        }

        return timepoint;
    }
}
