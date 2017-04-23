package com.verm9.ne.repository.model;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by verm9 on 4/23/2017
 */
@Entity
public class BtcCoin {
    @Id
    @Column(name="shortName")
    private String shortName;

    @OneToMany(targetEntity=BtcTimepoint.class, fetch=FetchType.LAZY)
    private List<BtcTimepoint> timepoints;

    public BtcCoin() {
        timepoints = new LinkedList<>();
    }

    public void addTimepoint(BtcTimepoint timepoint) {
        this.timepoints.add(timepoint);
    }


    // --[Coins getters and setters]----------------
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public List<BtcTimepoint> getTimepoints() {
        return timepoints;
    }

    public void setTimepoints(List<BtcTimepoint> timepoints) {
        this.timepoints = timepoints;
    }
    // --[End of Coins getters and setters]----------------
}
