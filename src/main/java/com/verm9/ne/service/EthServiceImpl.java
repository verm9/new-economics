package com.verm9.ne.service;

import com.verm9.ne.ds.GetCurrentData;
import com.verm9.ne.repository.CoinRepository;
import com.verm9.ne.repository.model.Coin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by verm on 3/5/2017.
 */
@Service
public class EthServiceImpl implements CoinService {
    @Autowired
    private CoinRepository dao;

    @Autowired
    @Qualifier("GetEthCurrentDataStubImpl")
    private GetCurrentData ds;

    @Override
    public Collection<Coin.Timepoint> getAllTimepoints() {
        return dao.getAllTimepoints();
    }

    @Override
    public boolean saveCurrentData() {
        Coin coin = ds.get();
        dao.upsertCoin(coin);
        return true;
    }
}
