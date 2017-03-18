package com.verm9.ne.ds.eth;

import com.verm9.ne.repository.model.Coin;
import com.verm9.ne.repository.model.EthCoin;
import com.verm9.ne.ds.GetCurrentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by verm9 on 2/21/2017.
 */
@Component("getEthCurrentDataImpl")
public class GetEthCurrentDataImpl implements GetCurrentData {

    @Autowired
    @Qualifier("ethCoin")
    private Coin coin;

    @Override
    public EthCoin get() {
        return null;
    }
}
