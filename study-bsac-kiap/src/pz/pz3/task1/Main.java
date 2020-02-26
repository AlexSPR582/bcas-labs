package pz.pz3.task1;

import pz.pz3.task1.time.Day;
import pz.pz3.task1.time.Hour;
import pz.pz3.task1.time.Minute;

public class Main {
    public static void main(String[] args) {
        Day day1 = new Day(15, 41);
        Day day2 = new Day(new Hour(18), new Minute(17));

        System.out.println(day1.getDayTime());
        day1.getCurrentTime();

        System.out.println(day2.getDayTime());
        day2.getCurrentTime();
    }
}
