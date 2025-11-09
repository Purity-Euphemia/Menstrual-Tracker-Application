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
        LocalDate periodEnd = addDays(start, duration - 1);
        LocalDate nextPeriodStart = addDays(start, cycleLength);
        LocalDate ovulationDay = addDays(start, cycleLength - 14);
        LocalDate fertileStart = subtractDays(ovulationDay, 3);
        LocalDate fertileEnd = addDays(ovulationDay, 3);
        LocalDate safeStart = addDays(periodEnd, 1);
        LocalDate safeEnd = subtractDays(fertileStart, 1);

        return new CycleDates(start, periodEnd, nextPeriodStart, ovulationDay, fertileStart, fertileEnd, safeStart, safeEnd);
    }

    public record CycleDates(
            LocalDate periodStart,
            LocalDate periodEnd,
            LocalDate nextPeriodStart,
            LocalDate ovulationDay,
            LocalDate fertileStart,
            LocalDate fertileEnd,
            LocalDate safeStart,
            LocalDate safeEnd
    ) {}

}
