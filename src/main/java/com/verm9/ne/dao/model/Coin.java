package com.verm9.ne.dao.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import static com.verm9.ne.dao.model.EthCoin.Timepoint;

/**
 * Created by verm9 on 2/21/2017.
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract public class Coin {
    @Id
    @Column(name="shortName")
    protected String shortName;
    @OneToMany(targetEntity=Timepoint.class, fetch=FetchType.EAGER)
    protected List<Timepoint> timepoints;

    public Coin() {
        timepoints = new LinkedList<>();
    }

    public void addTimepoint(Timepoint timepoint) {
        this.timepoints.add(timepoint);
    }


    // --[Coins getters and setters]----------------
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public List<Timepoint> getTimepoints() {
        return timepoints;
    }

    public void setTimepoints(List<Timepoint> timepoints) {
        this.timepoints = timepoints;
    }
    // --[End of Coins getters and setters]----------------
}
