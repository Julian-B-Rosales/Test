/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JulianRosales.test.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortalController {
// En el inicio da la opcion de buscar por nombre de usuario o skill
// Luego lista los resultados, al presionar en uno entro a la pagina de ese usuario
// Alli listo los skills de ese usuario
// Al presionar en un skill listo otros usuarios que posean ese skill tambien    
    @GetMapping("/")
    public String index(){
        
        return "index.html";
    }
}
