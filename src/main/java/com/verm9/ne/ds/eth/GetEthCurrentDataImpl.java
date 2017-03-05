package com.verm9.ne.ds.eth;

import com.verm9.ne.repository.model.EthCoin;
import com.verm9.ne.ds.GetCurrentData;
import org.springframework.stereotype.Component;

/**
 * Created by verm9 on 2/21/2017.
 */
@Component("GetEthCurrentDataImpl")
public class GetEthCurrentDataImpl implements GetCurrentData {
    @Override
    public EthCoin get() {
        return null;
    }
}
