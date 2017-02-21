package com.verm9.ne.ds.stubs;

import com.verm9.ne.dao.model.Coin;
import com.verm9.ne.dao.model.EthCoin;
import com.verm9.ne.ds.GetCurrentData;

import java.time.LocalDateTime;

/**
 * Created by verm9 on 2/21/2017.
 */
public class GetEthCurrentDataStubImpl implements GetCurrentData{
    @Override
    public Coin get() {
        EthCoin ethCoin = new EthCoin();
        Coin.Position position = new Coin.Position(LocalDateTime.now(), 13.3, 137_368_362_000_000D);
        ethCoin.addPosition(position);
        return ethCoin;
    }
}
