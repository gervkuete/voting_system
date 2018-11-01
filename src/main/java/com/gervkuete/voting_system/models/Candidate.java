/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gervkuete.voting_system.models;

/**
 *
 * @author Gervaislepetit
 */
public class Candidate {

    private int id;
    private String name;
    private String picture;
    private String aboutCandidate;
    private int voices;


    public Candidate() {
    }

    public Candidate(int id, String name, int voices, String aboutCandidate, String picture) {
        this.id = id;
        this.name = name;
        this.picture = picture;
        this.aboutCandidate = aboutCandidate;
        this.voices = voices;
    }

    public void addVoice() {
        voices++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getAboutCandidate() {
        return aboutCandidate;
    }

    public void setAboutCandidate(String aboutCandidate) {
        this.aboutCandidate = aboutCandidate;
    }

    public int getVoices() {
        return voices;
    }

}
