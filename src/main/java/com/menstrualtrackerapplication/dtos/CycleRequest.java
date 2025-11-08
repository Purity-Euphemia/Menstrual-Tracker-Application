package dtos;

import lombok.Data;



@Data
public class CycleRequest {
    private int cycleLength;
    private int periodDuration;
    private String lastPeriodStart;
}
