package com.verm9.ne.ds.eth.stubs;

import com.verm9.ne.repository.model.Coin;
import com.verm9.ne.repository.model.EthCoin;
import com.verm9.ne.ds.GetCurrentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by verm9 on 2/21/2017.
 */
@Component("getEthCurrentDataStubImpl")
public class GetEthCurrentDataStubImpl implements GetCurrentData {

    @Autowired
    @Qualifier("ethCoin")
    private Coin coin;

    @Override
    public EthCoin get() {
        EthCoin ethCoin = new EthCoin();
        EthCoin.Timepoint timepoint = new EthCoin.EthTimepoint(LocalDateTime.now(), 13.3, 137_368_362_000_000D);
        ethCoin.addTimepoint(timepoint);
        return ethCoin;
    }
}
