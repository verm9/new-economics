package com.verm9.ne.dao.model;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * Created by verm9 on 2/21/2017.
 */
@Entity
@Component
public class EthCoin extends Coin {
    public EthCoin() {
        this.setShortName("ETH");
    }

    @Entity
    public static class EthTimepoint extends Timepoint{
        public EthTimepoint(LocalDateTime time, double price, double difficulty) {
            super(time, price, difficulty);
        }
    }
}
