package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String nameStamp;
    private double heightStamp;
    private double widthStamp;
    private boolean stamped;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(heightStamp, stamp.heightStamp) == 0 && Double.compare(widthStamp, stamp.widthStamp) == 0 && stamped == stamp.stamped && Objects.equals(nameStamp, stamp.nameStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameStamp, heightStamp, widthStamp, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "nameStamp='" + nameStamp + '\'' +
                ", heightStamp=" + heightStamp +
                ", widthStamp=" + widthStamp +
                ", stamped=" + stamped +
                '}';
    }

    public Stamp(String nameStamp, double heightStamp, double widthStamp, boolean stamped) {
        this.nameStamp = nameStamp;
        this.heightStamp = heightStamp;
        this.widthStamp = widthStamp;
        this.stamped = stamped;
    }

    public String getNameStamp() {
        return nameStamp;
    }

    public double getHeightStamp() {
        return heightStamp;
    }

    public double getWidthStamp() {
        return widthStamp;
    }

    public boolean isStamped() {
        return stamped;
    }
}
