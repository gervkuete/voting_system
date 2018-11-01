package com.gervkuete.voting_system.models;

import com.gervkuete.voting_system.models.dataAccess.ElectorDAO;
import com.gervkuete.voting_system.views.HomePage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VotingSystem {
    private static VotingSystem Instance = null;
    
    private VotingSystem(){}

    /**
     * @return the votingSystem
     */
    public static VotingSystem getVotingSystem() {
        if (Instance == null) {
        Instance = new VotingSystem();
        }
        return Instance;
    }


    private Set<Elector> electorsList;
    private Voting currentVoting;
    private Elector currentElector;
    private static VotingSystem votingSystem;

    public static void main(String[] args) {
        
        HomePage hm = new HomePage();
        hm.setVisible(true);
    }

    // method for adding users
    public User addUser(int id, String name, String login, String password, boolean voted) {
        electorsList = new HashSet<>();
        Elector elector = new Elector(id, name, login, password, voted);
        electorsList.add(elector);
        return elector;
    }

    //find a user
    public User findUser(String login, String password) {
        return ElectorDAO.getElectorDAO().getElector(login, password);
    }

    // save users (insert them into the database)
    public void save() {
        String name;
        String login;
        String password;
        boolean voted;
        for (Elector elector : electorsList) {
            name = elector.getName();
            login = elector.getLogin();
            password = elector.getPassword();
            voted = elector.isVoted();
            ElectorDAO.getElectorDAO().insertElector(name, login, password, voted);

        }
    }

    // retrieve users from the database
    public void load() {
        ElectorDAO.getElectorDAO().getAllElectors();
    }

    // get results of a voting
    public List getResults() {
        List<Candidate> list = new ArrayList<>();
        list = getCurrentVoting().getCandidates();
        list.sort(Comparator.comparingInt(Candidate::getVoices));
        return list;
    }

    public Voting getCurrentVoting() {
        return currentVoting;
    }

    public Elector getCurrentElector() {
        return currentElector;
    }

    public void setCurrentElector(Elector currentElector) {
        this.currentElector = currentElector;
    }
    
    
    
    
}
