package com.example.demogradle.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.security.GeneralSecurityException;


@Controller
@RequestMapping(value = "/game")
public class GameController {

    @RequestMapping(value = "/index")
    public String index() {

        return "game/index";
    }
}
