package my.javarash.test;

import java.util.Date;

/**
 * Created by ALEX on 08.04.2017.
 */
public class TestDate {
    public static void main(String[] args) throws Exception{
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;

        int dayCount = (int) (msTimeDistance/msDay);
        System.out.println("Days from start of year: " + dayCount);
    }
}
