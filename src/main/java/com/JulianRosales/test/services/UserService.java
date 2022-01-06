package com.JulianRosales.test.services;

import com.JulianRosales.test.entities.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private JsonService jser;

    public User completeUserInfo(JSONObject myJson) {
        //Sending json object this function set info in the user object
        try {
            User u1 = new User();
            JSONObject person = myJson.getJSONObject("person");
            JSONArray strengths = (JSONArray) myJson.get("strengths");
            ArrayList<String> skills = new ArrayList<>();
            for (int i = 0; i < strengths.length(); i++) {
                skills.add(strengths.getJSONObject(i).getString("name"));
            }
            Collections.sort(skills);
            u1.setSkills(skills);

            u1.setCountry(myJson.getJSONObject("person").getJSONObject("location").getString("country"));
            u1.setPublicID(person.get("publicId").toString());
            u1.setName(myJson.getJSONObject("person").get("name").toString());
            u1.setProfilePictureURL((String) myJson.getJSONObject("person").get("picture"));
            
            //New features
            if(myJson.getJSONArray("experiences").isNull(0)){
                u1.setHasExp(false);
            }else{
                u1.setHasExp(true);
                JSONArray experiences = myJson.getJSONArray("experiences");
                for (int i = 0; i < experiences.length(); i++) {
                    try {
                        JSONObject jObject = experiences.getJSONObject(i);
                        if(jObject.has("category")){
                            ArrayList category = u1.getExpCategory();
                            category.add(jObject.getString("category"));
                            u1.setExpCategory(category);
                        } 
                        if(jObject.has("name")){
                            ArrayList name = u1.getExpName();
                            name.add(jObject.get("name").toString());
                            u1.setExpName(name);
                        } 
                        if(jObject.has("fromYear")){
                            ArrayList fromYear = u1.getExpFromYear();
                            fromYear.add(jObject.get("fromYear").toString());
                            u1.setExpFromYear(fromYear);
                        } 
                        if(jObject.has("toYear")){
                            ArrayList toYear = u1.getExpToYear();
                            toYear.add(jObject.get("toYear").toString());
                            u1.setExpToYear(toYear);
                        }
                        if(!jObject.has("toYear")){
                            ArrayList toYear = u1.getExpToYear();
                            toYear.add("In Progress");
                            u1.setExpToYear(toYear);
                        }
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
                
           
            return u1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
