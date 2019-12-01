package pl.qbsapps.skimanager.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.qbsapps.skimanager.service.ResultsService;

@RestController
@RequestMapping(value = "/results")
public class ResultsController {

    private final ResultsService resultsService;

    public ResultsController(ResultsService resultsService) {
        this.resultsService = resultsService;
    }

    @GetMapping
    public ResponseEntity getResults() {
        return ResponseEntity.ok(resultsService.getAllResults());
    }
}
