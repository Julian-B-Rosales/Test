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
    private ArrayList<String> skills;
    private String profilePictureURL;
    //Experiences:
    private boolean hasExp;
    private ArrayList<String> expCategory = new ArrayList<>();
    private ArrayList<String> expName = new ArrayList<>();
    private ArrayList<String> expFromYear = new ArrayList<>();
    private ArrayList<String> expToYear = new ArrayList<>();
    

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

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
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
        return "User{" + "name=" + name + ", \ncountry=" + country + ", \npublicID=" + publicID + ", \nskills=" + skills + ", \nprofilePictureURL=" + profilePictureURL + ", \nexpCategory=" + expCategory + ", \nexpName=" + expName + ", \nexpFromYear=" + expFromYear + ", \nexpToYear=" + expToYear + '}';
    }

    
    

    
    
    
}
