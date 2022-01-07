/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JulianRosales.test.entities;


import java.util.ArrayList;
import org.json.JSONArray;

public class User {
    private String name;
    private String country;
    private String publicID;
    private String bio;
    private String headLine;
    //skills
    private ArrayList<String> master;
    private ArrayList<String> expert;
    private ArrayList<String> interested;
    private ArrayList<String> novice;
    private ArrayList<String> proficient;
    private String profilePictureURL;
    //Experiences:
    private boolean hasExp;
    private ArrayList<String> expCategory = new ArrayList<>();
    private ArrayList<String> expName = new ArrayList<>();
    private ArrayList<String> expFromYear = new ArrayList<>();
    private ArrayList<String> expToYear = new ArrayList<>();

    

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }
    

    
    public String getProfilePictureURL() {
        return profilePictureURL;
    }

    public void setProfilePictureURL(String profilePictureURL) {
        this.profilePictureURL = profilePictureURL;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPublicID() {
        return publicID;
    }

    public void setPublicID(String publicID) {
        this.publicID = publicID;
    }

    public ArrayList<String> getMaster() {
        return master;
    }

    public void setMaster(ArrayList<String> master) {
        this.master = master;
    }

    public ArrayList<String> getExpert() {
        return expert;
    }

    public void setExpert(ArrayList<String> expert) {
        this.expert = expert;
    }

    public ArrayList<String> getInterested() {
        return interested;
    }

    public void setInterested(ArrayList<String> interested) {
        this.interested = interested;
    }

    public ArrayList<String> getNovice() {
        return novice;
    }

    public void setNovice(ArrayList<String> novice) {
        this.novice = novice;
    }

    public ArrayList<String> getProficient() {
        return proficient;
    }

    public void setProficient(ArrayList<String> proficient) {
        this.proficient = proficient;
    }

    

    public ArrayList<String> getExpCategory() {
        return expCategory;
    }

    public void setExpCategory(ArrayList<String> expCategory) {
        this.expCategory = expCategory;
    }

    public ArrayList<String> getExpName() {
        return expName;
    }

    public void setExpName(ArrayList<String> expName) {
        this.expName = expName;
    }

    public ArrayList<String> getExpFromYear() {
        return expFromYear;
    }

    public void setExpFromYear(ArrayList<String> expFromYear) {
        this.expFromYear = expFromYear;
    }

    public ArrayList<String> getExpToYear() {
        return expToYear;
    }

    public void setExpToYear(ArrayList<String> expToYear) {
        this.expToYear = expToYear;
    }

    public boolean isHasExp() {
        return hasExp;
    }

    public void setHasExp(boolean hasExp) {
        this.hasExp = hasExp;
    }
    
    

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", \ncountry=" + country + ", \npublicID=" + publicID  + ", \nprofilePictureURL=" + profilePictureURL + ", \nexpCategory=" + expCategory + ", \nexpName=" + expName + ", \nexpFromYear=" + expFromYear + ", \nexpToYear=" + expToYear + '}';
    }

    
    

    
    
    
}
