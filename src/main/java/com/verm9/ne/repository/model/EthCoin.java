package com.verm9.ne.repository.model;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by verm9 on 2/21/2017
 */
@Entity
public class EthCoin {
    @Id
    @Column(name="shortName")
    private String shortName;

    @OneToMany(targetEntity=EthTimepoint.class, fetch=FetchType.LAZY)
    private List<EthTimepoint> timepoints;

    public EthCoin() {
        timepoints = new LinkedList<>();
    }

    public void addTimepoint(EthTimepoint timepoint) {
        this.timepoints.add(timepoint);
    }


    // --[Coins getters and setters]----------------
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public List<EthTimepoint> getTimepoints() {
        return timepoints;
    }

    public void setTimepoints(List<EthTimepoint> timepoints) {
        this.timepoints = timepoints;
    }
    // --[End of Coins getters and setters]----------------
}
