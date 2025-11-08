package service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Service
public class CycleCalculatorService {
    public Map<String, LocalDate> calculateCycle(LocalDate lastPeriodStart, int cycleLength, int periodDuration) {
        Map<String, LocalDate> result = new HashMap<>();

        LocalDate periodEnd = lastPeriodStart.plusDays(periodDuration - 1);
        LocalDate nextPeriodStart = lastPeriodStart.plusDays(cycleLength);
        LocalDate ovulationDay = lastPeriodStart.plusDays(cycleLength - 14);
        LocalDate fertileStart = ovulationDay.minusDays(3);
        LocalDate fertileEnd = ovulationDay.plusDays(3);
        LocalDate safeStart = periodEnd.plusDays(1);
        LocalDate safeEnd = fertileStart.minusDays(1);

        result.put("periodStart", lastPeriodStart);
        result.put("periodEnd", periodEnd);
        result.put("nextPeriodStart", nextPeriodStart);
        result.put("ovulationDay", ovulationDay);
        result.put("fertileStart", fertileStart);
        result.put("fertileEnd", fertileEnd);
        result.put("safeStart", safeStart);
        result.put("safeEnd", safeEnd);
    }

}
