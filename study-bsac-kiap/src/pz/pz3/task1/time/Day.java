package pz.pz3.task1.time;

import java.util.Objects;

public class Day {
    private Hour hours;
    private Minute minutes;

    public Day(Hour hour, Minute minute) {
        this.hours = hour;
        this.minutes = minute;
    }

    public Day(int hours, int minutes) {
        this.hours = new Hour(hours);
        this.minutes = new Minute(minutes);
    }

    public void getCurrentTime() {
        System.out.println(hours.getHour() + "ч. "
                + minutes.getMinutes() + "мин.");
    }

    public DayTime getDayTime() {
        double time = hours.getHour() + minutes.getMinutes() / 60.0;
        if (time >= 0 && time < 6) {
            return DayTime.NIGHT;
        }
        else if (time >= 6 && time < 12) {
            return DayTime.MORNING;
        }
        else if (time >= 12 && time < 18) {
            return DayTime.AFTERNOON;
        }
        else {
            return DayTime.EVENING;
        }
    }

    public Hour getHours() {
        return hours;
    }

    public void setHours(Hour hours) {
        this.hours = hours;
    }

    public Minute getMinutes() {
        return minutes;
    }

    public void setMinutes(Minute minutes) {
        this.minutes = minutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day = (Day) o;
        return Objects.equals(hours, day.hours) &&
                Objects.equals(minutes, day.minutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hours, minutes);
    }

    @Override
    public String toString() {
        return "Day{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
