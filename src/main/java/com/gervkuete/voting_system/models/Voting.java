
package com.gervkuete.voting_system.models;

import java.util.List;


public class Voting {
    private String title;
    private List<Candidate> candidatesList;
    
    public Voting(String title, List<Candidate> candidates) {
        this.title = title;
        this.candidatesList = candidates;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Candidate> getCandidates() {
        return candidatesList;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidatesList = candidates;
    }
    
    
}
