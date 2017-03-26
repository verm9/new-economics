package com.verm9.ne.repository.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by verm9 on 2/21/2017
 */
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
abstract public class Coin {
    @Id
    @Column(name="shortName")
    protected String shortName;
    @OneToMany(targetEntity=Timepoint.class, fetch=FetchType.LAZY)
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

    @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
    @Entity
    abstract public static class Timepoint {
        @Id
        @GeneratedValue(strategy=GenerationType.TABLE)
        private Long id;
        @Column(name="timestamp")
        private LocalDateTime time;
        @Column(name="price")
        private double price;
        @Column(name="totalHashRate")
        private double totalHashRate;

        public Timepoint(LocalDateTime time, double price, double totalHashRate) {
            this.time = time;
            this.price = price;
            this.totalHashRate = totalHashRate;
        }

        protected Timepoint() {
        }

        // --[Timepoints getters and setters]----------------
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

        public double getTotalHashRate() {
            return totalHashRate;
        }

        public void setTotalHashRate(double totalHashRate) {
            this.totalHashRate = totalHashRate;
        }
        // --[End of Timepoints getters and setters]----------------
    }
}
