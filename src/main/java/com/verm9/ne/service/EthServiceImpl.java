package com.verm9.ne.service;

import com.verm9.ne.ds.GetCurrentData;
import com.verm9.ne.repository.EthRepositoryImpl;
import com.verm9.ne.repository.model.EthTimepoint;
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
    private EthRepositoryImpl dao;

    @Autowired
    @Qualifier("getEthCurrentDataImpl")
    private GetCurrentData ds;

    @Override
    public Collection<EthTimepoint> getAllTimepoints() {
        return dao.getAllTimepoints();
    }

    public EthTimepoint getLastTimepoint() {
        return dao.getLastTimepoint();
    }

    @Override
    public boolean saveCurrentData() {
        EthTimepoint coin = (EthTimepoint) ds.getTimepoint();
        dao.upsertTimePoint(coin);
        return true;
    }
}
