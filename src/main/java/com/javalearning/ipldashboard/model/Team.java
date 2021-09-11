package com.javalearning.ipldashboard.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Team {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String teamName;
    private long totolMatches;
    private long totalWins;

    @Transient
    private List<Match> matches;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public long getTotolMatches() {
        return totolMatches;
    }
    public void setTotolMatches(long totolMatches) {
        this.totolMatches = totolMatches;
    }
    public long getTotalWins() {
        return totalWins;
    }
    public void setTotalWins(long totalWins) {
        this.totalWins = totalWins;
    }
    public Team(String teamName, long totolMatches) {
        this.teamName = teamName;
        this.totolMatches = totolMatches;
    }

    @Override
    public String toString() {
        return "Team [teamName=" + teamName + ", totalWins=" + totalWins + ", totolMatches=" + totolMatches + "]";
    }

    public Team() {

    }

    public List<Match> getMatches() {
        return matches;
    }
    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

}
