package com.verm9.ne.service;

import com.verm9.ne.repository.model.Coin;

import java.util.Collection;

/**
 * Created by verm on 3/5/2017.
 */
public interface CoinService {
    Collection<Coin.Timepoint> getAllTimepoints();

    boolean saveCurrentData();
}
