package com.verm9.ne.repository;

import com.verm9.ne.repository.model.Coin;
import com.verm9.ne.repository.model.Coin.Timepoint;

import java.util.Collection;

/**
 * Created by verm on 3/5/2017.
 */
public interface CoinRepository {
    Collection<Timepoint> getAllTimepoints();

    void upsertCoin(Coin coin);

}
