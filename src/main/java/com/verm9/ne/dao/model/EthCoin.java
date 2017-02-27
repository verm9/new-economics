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
    public static class Timepoint {
        @Id
        @Column(name="timestamp")
        private LocalDateTime time;
        @Column(name="price")
        private double price;
        @Column(name="difficulty")
        private double difficulty;

        public Timepoint(LocalDateTime time, double price, double difficulty) {
            this.time = time;
            this.price = price;
            this.difficulty = difficulty;
        }

        // --[Positions getters and setters]----------------
        public LocalDateTime getTime() {
            return time;
        }

        public void setTime(LocalDateTime time) {
            this.time = time;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getDifficulty() {
            return difficulty;
        }

        public void setDifficulty(double difficulty) {
            this.difficulty = difficulty;
        }
        // --[End of Positions getters and setters]----------------
    }
}
