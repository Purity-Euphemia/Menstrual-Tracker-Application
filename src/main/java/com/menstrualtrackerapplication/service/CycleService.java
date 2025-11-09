package service;

import dtos.CycleRequest;
import dtos.CycleResponse;
import lombok.RequiredArgsConstructor;
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

        



    }
