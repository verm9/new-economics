package com.verm9.ne.ds.btc;

import com.verm9.ne.ds.Coin;
import com.verm9.ne.ds.GetCurrentData;
import com.verm9.ne.ds.WhattomineAsicDs;
import com.verm9.ne.ds.model.whattomineasic.Bitcoin;
import com.verm9.ne.ds.model.whattomineasic.WhatToMineAsicPojo;
import com.verm9.ne.repository.model.BtcCoin;
import com.verm9.ne.repository.model.BtcTimepoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by verm9 on 4/23/2017
 */
@Component("getBtcCurrentDataImpl")
public class GetBtcCurrentDataImpl implements GetCurrentData {

    @Autowired
    private WhattomineAsicDs ds;

    private BtcCoin coin;

    /**
     * Gets data from external resources for this moment of time.
     * Data source is http://whattomine.com/coins.json
     * POJO structure created by http://www.jsonschema2pojo.org
     */
    @Override
    public BtcTimepoint getTimepoint() {

        WhatToMineAsicPojo whatToMineAsicPojo = (WhatToMineAsicPojo) ds.getTimepoint(Coin.BTC);

        return getTimepointFromGeneralPojo(whatToMineAsicPojo);
    }

    public BtcTimepoint getTimepointFromGeneralPojo(WhatToMineAsicPojo whatToMineCoinsPojo) {
        BtcTimepoint result;

        Bitcoin bitcoinPojo = whatToMineCoinsPojo.getCoins().getBitcoin();

        result = new BtcTimepoint( bitcoinPojo.getTimestamp(),
                bitcoinPojo.getExchangeRate24(),
                Double.valueOf(bitcoinPojo.getNethash()) );

        return result;
    }
}
