package service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Service
public class CycleCalculatorService {
    public Map<String, LocalDate> calculateCycle(LocalDate lastPeriodStart, int cycleLength, int periodDuration) {
        Map<String, LocalDate> result = new HashMap<>();
    }

}
