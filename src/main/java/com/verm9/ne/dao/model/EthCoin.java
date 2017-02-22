package com.verm9.ne.dao.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;

/**
 * Created by verm9 on 2/21/2017.
 */
@Entity
@Component
public class EthCoin extends Coin {
    public EthCoin() {
        this.setShortName("ETH");
    }
}
