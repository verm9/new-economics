package com.verm9.ne.ds.eth.stubs;

import com.verm9.ne.ds.GetCurrentData;
import com.verm9.ne.repository.model.EthCoin;
import com.verm9.ne.repository.model.EthTimepoint;
import org.springframework.stereotype.Component;

/**
 * Created by verm9 on 2/21/2017.
 */
@Component("getEthCurrentDataStubImpl")
public class GetEthCurrentDataStubImpl implements GetCurrentData {

    @Override
    public EthCoin getTimepoint() {
        EthCoin ethCoin = new EthCoin();
        EthTimepoint timepoint = new EthTimepoint(1490532490000L, 13.3, 137_368_362_000_000D);
        ethCoin.addTimepoint(timepoint);
        return ethCoin;
    }
}
