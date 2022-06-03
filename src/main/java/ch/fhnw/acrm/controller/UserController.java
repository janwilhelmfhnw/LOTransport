/*
 * Copyright (c) 2020. University of Applied Sciences and Arts Northwestern Switzerland FHNW.
 * All rights reserved.
 */

package ch.fhnw.acrm.controller;

import ch.fhnw.acrm.business.service.AgentService;
import ch.fhnw.acrm.business.service.LogToFileService;
import ch.fhnw.acrm.data.domain.Agent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class UserController {

    @Autowired
    private AgentService agentService;

    @GetMapping("/login")
    public String getLoginView() {
        return "user/login.html";
    }

    @GetMapping("/home")
    public String getHomeViev() { return "user/home.html";}

    @GetMapping("/user/register")
    public String getRegisterView() {
        return "register.html";
    }

    @GetMapping("/about")
    public String getAboutUsView() {
        return "user/about.html";
    }

    @PostMapping("/user/register")
    public ResponseEntity<Void> postRegister(@RequestBody Agent agent) {
        try {
            agentService.saveAgent(agent);
            LogToFileService.logUser("User: " + agent.getName() + " has registered an account");
        } catch (Exception e) {
            LogToFileService.logSystem("warning", e.toString());
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/settings/edit")
    public String getProfileView() {
        return "../user/settings.html";
    }

    @GetMapping("/settings")
    public @ResponseBody Agent getProfile() {
        return agentService.getCurrentAgent();
    }

//    @GetMapping("/customer")
//    public @ResponseBody Agent getAddress() {
//        return agentService.getCurrentAgent();
//    }

    @PutMapping("/settings")
    public ResponseEntity<Void> putProfile(@RequestBody Agent agent) {
        try {
            agent.setId(agentService.getCurrentAgent().getId());
            agentService.saveAgent(agent);
           // TestUserIntoString.AddressString();
            LogToFileService.logUser("User " + agent.getName() + " has updated his profile!:" +"\n"+ "Name: "+ agent.getName()+ ", Email: "+ agent.getEmail());
        } catch (Exception e) {
            LogToFileService.logUser( agent.getName() + " has not changed his profile.");
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, e.getMessage());
        }
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/validate", method = {RequestMethod.GET, RequestMethod.HEAD})
    public ResponseEntity<Void> init() {
        return ResponseEntity.ok().build();
    }


}