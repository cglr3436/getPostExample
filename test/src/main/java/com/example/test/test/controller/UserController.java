package com.example.test.test.controller;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.test.model.User;

@RestController
public class UserController {


HashMap<String, User> capitalCities = new HashMap<String, User>();

    @PostMapping("/user/add")
    public User addUser(@RequestBody User details){

        capitalCities.put(details.getUsername(), details);

        return details;
    }


  
    
    @RequestMapping(value = "/user", params = "username", method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@RequestParam("username") String username) {

        if(capitalCities.containsKey(username)){
            return capitalCities.get(username);
        }
        return null;

   

    }

}
