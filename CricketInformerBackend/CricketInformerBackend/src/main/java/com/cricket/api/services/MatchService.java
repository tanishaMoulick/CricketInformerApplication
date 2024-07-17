package com.cricket.api.services;
import java.util.List;
import java.util.Map;
import com.cricket.api.entities.Match;


public interface MatchService {
    List<Match> getAllMatches();
    List<Match> getLiveMatches();
    List<List<String>> getPointTable();
}
