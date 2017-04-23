package com.verm9.ne.ds.eth;

import com.verm9.ne.ds.Coin;
import com.verm9.ne.ds.GetCurrentData;
import com.verm9.ne.ds.WhattomineCoinsDs;
import com.verm9.ne.ds.model.whattominecoins.Ethereum;
import com.verm9.ne.ds.model.whattominecoins.WhatToMineCoinsPojo;
import com.verm9.ne.repository.model.EthCoin;
import com.verm9.ne.repository.model.EthTimepoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by verm9 on 2/21/2017
 */
@Component("getEthCurrentDataImpl")
public class GetEthCurrentDataImpl implements GetCurrentData {

    @Autowired
    private WhattomineCoinsDs ds;

    private EthCoin coin;

    /**
     * Gets data from external resources for this moment of time.
     * Data source is http://whattomine.com/coins.json
     * POJO structure created by http://www.jsonschema2pojo.org
     */
    @Override
    public EthTimepoint getTimepoint() {

        WhatToMineCoinsPojo whatToMineCoinsPojo = (WhatToMineCoinsPojo) ds.getTimepoint(Coin.ETH);

        return getTimepointFromGeneralPojo(whatToMineCoinsPojo);
    }

    public EthTimepoint getTimepointFromGeneralPojo(WhatToMineCoinsPojo whatToMineCoinsPojo) {
        EthTimepoint result;
        Ethereum ethereumPojo = whatToMineCoinsPojo.getCoins().getEthereum();

        result = new EthTimepoint( ethereumPojo.getTimestamp(),
                ethereumPojo.getExchangeRate24(),
                Double.valueOf(ethereumPojo.getNethash()) );

        return result;
    }
}
