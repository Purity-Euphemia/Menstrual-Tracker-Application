package service;

import dtos.CycleRequest;
import dtos.CycleResponse;
import lombok.RequiredArgsConstructor;
import model.UserCycle;
import org.springframework.stereotype.Service;
import repository.UserCycleRepository;
import utils.CycleCalculator;

import java.time.LocalDate;


@Service
@RequiredArgsConstructor
public class CycleService {

    private final UserCycleRepository userCycleRepository;


    public CycleResponse calculateAndSaveCycle(CycleRequest request) {
        LocalDate start = LocalDate.parse(request.getLastPeriodStart());

        var calc = CycleCalculator.calculateCycle(start, request.getCycleLength(), request.getPeriodDuration());

        UserCycle cycle = UserCycle.builder()
                .lastPeriodStart(calc.periodStart())
                .cycleLength(request.getCycleLength())
                .periodDuration(request.getPeriodDuration())
                .nextPeriodStart(calc.nextPeriodStart())
                .periodEnd(calc.periodEnd())
                .ovulationDay(calc.ovulationDay())
                .fertileStart(calc.fertileStart())
                .fertileEnd(calc.fertileEnd())
                .safeStart(calc.safeStart())
                .safeEnd(calc.safeEnd())
                .build();

        userCycleRepository.save(cycle);

        return CycleResponse.builder()
                .periodStart(calc.periodStart())
                .periodEnd(calc.periodEnd())
                .nextPeriodStart(calc.nextPeriodStart())
                .ovulationDay(calc.ovulationDay())
                .fertileStart(calc.fertileStart())
                .fertileEnd(calc.fertileEnd())
                .safeStart(calc.safeStart())
                .safeEnd(calc.safeEnd())
                .build();
    }




}
