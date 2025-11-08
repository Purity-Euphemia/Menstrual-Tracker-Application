package dtos;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CycleResponse {
    private LocalDate periodStart;
    private LocalDate periodEnd;
    private LocalDate nextPeriodStart;
    private LocalDate ovulationDay;
    private LocalDate fertileStart;
    private LocalDate fertileEnd;
    private LocalDate safeStart;
    private LocalDate safeEnd;
}
