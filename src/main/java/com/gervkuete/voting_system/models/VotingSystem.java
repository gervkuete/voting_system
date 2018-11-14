package com.gervkuete.voting_system.models;

import com.gervkuete.voting_system.views.HomePage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VotingSystem {

    private static VotingSystem instance = null;

    private VotingSystem() {
    }

    public static VotingSystem getVotingSystem() {
        if (instance == null) {
            instance = new VotingSystem();
        }
        return instance;
    }

    private Voting currentVoting;
    private Elector currentElector;

    public static void main(String[] args) {

        HomePage hm = new HomePage();
        hm.setVisible(true);
    }

    // get results of voting
    public List getResults() {
        List<Candidate> list = new ArrayList<>();
        list = getCurrentVoting().getCandidates();
        list.sort(Comparator.comparingInt(Candidate::getVoices));
        return list;
    }

    public Voting getCurrentVoting() {
        return currentVoting;
    }

    public void setCurrentVoting(Voting currentVoting) {
        this.currentVoting = currentVoting;
    }

    public Elector getCurrentElector() {
        return currentElector;
    }

    public void setCurrentElector(Elector currentElector) {
        this.currentElector = currentElector;
    }

}
