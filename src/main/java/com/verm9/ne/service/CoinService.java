package com.verm9.ne.service;

import java.util.Collection;

/**
 * Created by verm on 3/5/2017.
 */
public interface CoinService {
    Collection<?> getAllTimepoints();

    boolean saveCurrentData();
}
