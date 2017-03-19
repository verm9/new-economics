package com.verm9.ne.repository.model;

/**
 * Created by verm on 3/18/2017
 * Contains results of profit calculations. The POJO is returning by Spring MVC.
 */
public class Profit {
    private Double profitInCryptoCurrency;
    private Double profitInBtc;
    private Double profitInUsd;
    private Double profitInRub;
    private Double wastedPowerInRub;

    private Double roiDays; // for rubles

    public Profit() {
    }


    public Double getProfitInCryptoCurrency() {
        return profitInCryptoCurrency;
    }

    public void setProfitInCryptoCurrency(Double profitInCryptoCurrency) {
        this.profitInCryptoCurrency = profitInCryptoCurrency;
    }

    public Double getProfitInUsd() {
        return profitInUsd;
    }

    public void setProfitInUsd(Double profitInUsd) {
        this.profitInUsd = profitInUsd;
    }

    public Double getProfitInRub() {
        return profitInRub;
    }

    public void setProfitInRub(Double profitInRub) {
        this.profitInRub = profitInRub;
    }

    public Double getRoiDays() {
        return roiDays;
    }

    public void setRoiDays(Double roiDays) {
        this.roiDays = roiDays;
    }

    public Double getProfitInBtc() {
        return profitInBtc;
    }

    public void setProfitInBtc(Double profitInBtc) {
        this.profitInBtc = profitInBtc;
    }

    public Double getWastedPowerInRub() {
        return wastedPowerInRub;
    }

    public void setWastedPowerInRub(Double wastedPowerInRub) {
        this.wastedPowerInRub = wastedPowerInRub;
    }
}
