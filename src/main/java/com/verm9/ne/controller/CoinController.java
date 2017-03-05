package com.verm9.ne.controller;

import com.verm9.ne.repository.model.Coin.Timepoint;

import java.util.Collection;

/**
 * Created by verm on 3/5/2017.
 */
public interface CoinController {
    Collection<? extends Timepoint> getAllTimepoints();
}
