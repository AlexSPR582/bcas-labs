package pz.pz3.task1.time;

import java.util.Objects;

public class Hour {
    private int hours = 0;

    public Hour(int hours) {
        if (check(hours)) {
            this.hours = hours;
        }
    }

    public int getHour() {
        return hours;
    }

    public void setHour(int hour) {
        this.hours = hour;
    }

    private boolean check(int hours) {
        return hours >= 0 && hours < 24;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hour hour = (Hour) o;
        return hours == hour.hours;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours);
    }

    @Override
    public String toString() {
        return "Hour{" +
                "hours=" + hours +
                '}';
    }
}
