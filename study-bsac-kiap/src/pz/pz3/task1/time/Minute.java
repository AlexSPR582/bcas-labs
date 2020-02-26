package pz.pz3.task1.time;

import java.util.Objects;

public class Minute {
    private int minutes = 0;

    public Minute(int minutes) {
        if (check(minutes)) {
            this.minutes = minutes;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    private boolean check(int minutes) {
        return minutes < 60 && minutes >= 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Minute minute = (Minute) o;
        return minutes == minute.minutes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minutes);
    }

    @Override
    public String toString() {
        return "Minute{" +
                "minutes=" + minutes +
                '}';
    }
}
