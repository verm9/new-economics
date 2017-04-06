package com.verm9.ne.service;

import com.verm9.ne.repository.model.EthTimepoint;

import java.util.Collection;

/**
 * Created by verm on 3/5/2017.
 */
public interface CoinService {
    Collection<?> getAllTimepoints();

    EthTimepoint saveCurrentData();
}
