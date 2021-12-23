package com.JulianRosales.test.services;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class JsonService {
    //Find and return a jsonobject by publicID
    public JSONObject getJSONObject(String publicID) {
        try {

            URL url = new URL("https://torre.bio/api/bios/" + publicID);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Getting the response code
            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                String inline = "";
                Scanner scanner = new Scanner(url.openStream());

                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }

                //Close the scanner
                scanner.close();

                //
                JSONObject myJson = new JSONObject(inline);
                return myJson;

            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public String getName(String publicID) {
       
        JSONObject myJson =  getJSONObject(publicID);
        
        JSONObject person = new JSONObject(myJson.get("person").toString());
        String name = person.get("name").toString();
        
        return name;
    }
    
    public String getSkills(String publicID) {
       
        JSONObject myJson =  getJSONObject(publicID);
        
        String skills = myJson.get("strengths").toString();
        
        return skills;
    }
    
public String getPicture(JSONObject myJson) {
        JSONObject person = new JSONObject(myJson.getJSONObject("person"));
        String picture = person.get("picture").toString();
        
        return picture;
    }
}
