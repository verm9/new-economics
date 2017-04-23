package com.verm9.ne.repository.model;

import javax.persistence.*;

/**
 * Created by verm on 4/23/2017
 */
@Entity
public class BtcTimepoint {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;
    @Column(name="timestamp")
    private Long time;
    @Column(name="price")
    private Double price; // in USD
    @Column(name="totalHashRate")
    private Double totalHashRate;

    public BtcTimepoint(Long time, Double price, Double totalHashRate) {
        this.time = time;
        this.price = price;
        this.totalHashRate = totalHashRate;
    }

    public BtcTimepoint() {
    }

    // --[Timepoints getters and setters]----------------
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalHashRate() {
        return totalHashRate;
    }

    public void setTotalHashRate(Double totalHashRate) {
        this.totalHashRate = totalHashRate;
    }
    // --[End of Timepoints getters and setters]----------------
}