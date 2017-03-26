package com.verm9.ne.repository.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.time.LocalDateTime;

/**
 * Created by verm9 on 2/21/2017.
 */
@Entity
@Component("ethCoin")
public class EthCoin extends Coin {
    public EthCoin() {
        this.setShortName("ETH");
    }

    @Entity
    public static class EthTimepoint extends Timepoint {

        public EthTimepoint() {
        }

        public EthTimepoint(LocalDateTime time, double price, double totalHashRate) {
            super(time, price, totalHashRate);
        }
    }
}
