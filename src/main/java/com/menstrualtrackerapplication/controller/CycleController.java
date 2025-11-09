package controller;

import dtos.CycleRequest;
import dtos.CycleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import service.CycleService;

@RestController
@RequestMapping("/api/cycle")
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
public class CycleController {
    private final CycleService cycleService;

    @PostMapping("/calculate")
    public CycleResponse calculateCycle(@RequestBody CycleRequest request) {
        return cycleService.calculateAndSaveCycle(request);
    }
}
