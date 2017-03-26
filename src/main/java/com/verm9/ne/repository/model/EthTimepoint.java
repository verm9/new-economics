package com.verm9.ne.repository.model;

import javax.persistence.*;

/**
 * Created by verm on 3/26/2017
 */
@Entity
public class EthTimepoint {
    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private Long id;
    @Column(name="timestamp")
    private long time;
    @Column(name="price")
    private double price;
    @Column(name="totalHashRate")
    private double totalHashRate;

    public EthTimepoint(long time, double price, double totalHashRate) {
        this.time = time;
        this.price = price;
        this.totalHashRate = totalHashRate;
    }

    public EthTimepoint() {
    }

    // --[Timepoints getters and setters]----------------
    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalHashRate() {
        return totalHashRate;
    }

    public void setTotalHashRate(double totalHashRate) {
        this.totalHashRate = totalHashRate;
    }
    // --[End of Timepoints getters and setters]----------------
}