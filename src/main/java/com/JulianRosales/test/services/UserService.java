package com.JulianRosales.test.services;

import com.JulianRosales.test.entities.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
            JSONObject strenghts = myJson.getJSONObject("strengths");

            u1.setCountry(location.get("country").toString());
            u1.setPublicID(person.get("publicId").toString());
            u1.setName(person.get("name").toString());

            JSONObject skills = strenghts.getJSONObject("name");
            Iterator x = skills.keys();
            List<String> skillsList= new ArrayList<String>() ;

            while (x.hasNext()) {
                String key = (String) x.next();
                skillsList.add((String) skills.get(key));
            }
            return u1;
            } catch (Exception e) {
                return null;
        }
    }
    
    
}
