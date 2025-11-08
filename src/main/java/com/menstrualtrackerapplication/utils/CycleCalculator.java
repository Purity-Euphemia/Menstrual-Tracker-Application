package utils;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class CycleCalculator {
    public static LocalDate addDays(LocalDate date, int days){
        return date.plusDays(days);
    }
    public static LocalDate subtractDays(LocalDate date, int days){
        return date.minusDays(days);
    }
    public static CycleDates calculateCycle(LocalDate start, int cycleLength, int duration){
        LocalDate period
    }
}
