package com.springframework.spring5webapp.controllers;


import com.springframework.spring5webapp.repositories.CommunicationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CommunicationController {

    private CommunicationRepository communicationRepository;

    public CommunicationController(CommunicationRepository communicationRepository) {
        this.communicationRepository = communicationRepository;
    }

    @RequestMapping("/communications")
    public String getUsers(Model model){

        model.addAttribute("communications", communicationRepository.findAll());

        return "communications";
    }
}

