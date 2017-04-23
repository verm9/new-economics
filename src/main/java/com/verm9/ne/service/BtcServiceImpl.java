package com.verm9.ne.service;

import com.verm9.ne.ds.GetCurrentData;
import com.verm9.ne.repository.BtcRepositoryImpl;
import com.verm9.ne.repository.model.BtcTimepoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by verm on 4/23/2017
 */
@Service
public class BtcServiceImpl {
    @Autowired
    private BtcRepositoryImpl dao;

    @Autowired
    @Qualifier("getBtcCurrentDataImpl")
    private GetCurrentData ds;

    public Collection<BtcTimepoint> getAllTimepoints() {
        return dao.getAllTimepoints();
    }

    public BtcTimepoint getLastTimepoint() {
        return dao.getLastTimepoint();
    }

    public BtcTimepoint saveCurrentData() {
        BtcTimepoint timepoint = (BtcTimepoint) ds.getTimepoint();
        return saveData(timepoint);
    }

    public BtcTimepoint saveData(BtcTimepoint t) {
        dao.upsertTimePoint(t);
        return t;
    }

    public BtcTimepoint getClosestTimepoint(long timestamp) {
        return dao.getClosestTimepoint(timestamp);
    }
}
