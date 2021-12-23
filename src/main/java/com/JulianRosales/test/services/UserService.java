package com.JulianRosales.test.services;

import com.JulianRosales.test.entities.User;
import java.util.ArrayList;
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
            JSONObject location = person.getJSONObject("location");
            
            JSONArray strengths = (JSONArray) myJson.get("strengths");
            ArrayList<String> skills = new ArrayList<>();
            for (int i = 0; i < strengths.length(); i++) {
                skills.add(strengths.getJSONObject(i).getString("name"));
            }
            u1.setSkills(skills);

            u1.setCountry(myJson.getJSONObject("person").getJSONObject("location").getString("country"));
            u1.setPublicID(person.get("publicId").toString());
            u1.setName(myJson.getJSONObject("person").get("name").toString());
//            u1.setProfilePictureURL(jser.getPicture(myJson));
            
            
           
            return u1;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
