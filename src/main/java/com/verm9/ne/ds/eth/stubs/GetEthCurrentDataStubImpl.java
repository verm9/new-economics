package com.verm9.ne.ds.eth.stubs;

import com.verm9.ne.repository.model.Coin;
import com.verm9.ne.repository.model.EthCoin;
import com.verm9.ne.ds.GetCurrentData;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by verm9 on 2/21/2017.
 */
@Component("GetEthCurrentDataStubImpl")
public class GetEthCurrentDataStubImpl implements GetCurrentData {
    @Override
    public Coin get() {
        EthCoin ethCoin = new EthCoin();
        EthCoin.Timepoint timepoint = new EthCoin.EthTimepoint(LocalDateTime.now(), 13.3, 137_368_362_000_000D);
        ethCoin.addTimepoint(timepoint);
        return ethCoin;
    }
}
