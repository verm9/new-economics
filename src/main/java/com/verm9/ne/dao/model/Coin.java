package com.verm9.ne.dao.model;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by verm9 on 2/21/2017.
 */
abstract public class Coin {
    protected String shortName;
    protected List<Position> positions;

    public Coin() {
        positions = new LinkedList<>();
    }

    public void addPosition(Position position) {
        this.positions.add(position);
    }

    public static class Position {
        private LocalDateTime time;
        private double price;
        private double difficulty;

        public Position(LocalDateTime time, double price, double difficulty) {
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

    // --[Coins getters and setters]----------------
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }
    // --[End of Coins getters and setters]----------------
}
