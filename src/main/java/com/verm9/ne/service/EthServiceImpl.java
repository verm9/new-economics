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
public class EthServiceImpl {
    @Autowired
    private EthRepositoryImpl dao;

    @Autowired
    @Qualifier("getEthCurrentDataImpl")
    private GetCurrentData ds;

    public Collection<EthTimepoint> getAllTimepoints() {
        return dao.getAllTimepoints();
    }

    public EthTimepoint getLastTimepoint() {
        return dao.getLastTimepoint();
    }

    public EthTimepoint saveCurrentData() {
        EthTimepoint timepoint = (EthTimepoint) ds.getTimepoint();
        return saveData(timepoint);
    }

    public EthTimepoint saveData(EthTimepoint t) {
        dao.upsertTimePoint(t);
        return t;
    }

    public EthTimepoint getClosestTimepoint(long timestamp) {
        return dao.getClosestTimepoint(timestamp);
    }
}
