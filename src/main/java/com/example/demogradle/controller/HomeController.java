package com.example.demogradle.controller;

import com.example.demogradle.common.DataMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.HashMap;

import java.net.InetAddress;

@Controller
public class HomeController {




    @RequestMapping("/")
    public String home(@RequestParam HashMap<String, Object> param, Integer cpage, ModelMap modelMap, HttpServletRequest request) throws UnknownHostException {

        DataMap paramMap = new DataMap(param);

        LocalDateTime now = LocalDateTime.now();
        modelMap.put("now", now);

        InetAddress inetAddress = InetAddress.getLocalHost();

        String ip = inetAddress.getHostAddress();
        String JDBC_CONNECTION_STRING = System.getProperty("JDBC_CONNECTION_STRING");

        modelMap.put("ip", ip);
        modelMap.put("JDBC_CONNECTION_STRING", JDBC_CONNECTION_STRING);



        return "index";
    }
}

