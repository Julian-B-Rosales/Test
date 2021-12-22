/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JulianRosales.test.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.json.JSONObject;

@Entity
public class User {
    private String name;
    private String country;
    @Id
    private String publicID;
    private JSONObject skills;

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

    public JSONObject getSkills() {
        return skills;
    }

    public void setSkills(JSONObject skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", \ncountry=" + country + ", \npublicID=" + publicID + ", \nskills=" + skills + '}';
    }
    
    
}
