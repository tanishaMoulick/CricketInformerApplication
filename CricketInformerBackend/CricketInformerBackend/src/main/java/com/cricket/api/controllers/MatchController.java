package com.cricket.api.controllers;

import com.cricket.api.entities.Match;
import com.cricket.api.services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")

public class MatchController {
    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    // api for getting live matches

//    @GetMapping("/live")
//    public ResponseEntity<?> getLiveMatchScores() throws InterruptedException {
//        System.out.println("getting live match");
//        return new ResponseEntity<>(this.matchService.getLiveMatchScores(), HttpStatus.OK);
//    }
//
    @GetMapping("/point-table")
    public ResponseEntity<?> getCWC2023PointTable() {
        return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches() {
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Match>>getAllMatches() {
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }
}
