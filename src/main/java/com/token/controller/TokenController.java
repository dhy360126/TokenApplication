package com.token.controller;

import com.stater.service.TokenRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TokenController {

   @Autowired
   private TokenRedisService tokenRediseService;

   @RequestMapping("/token")
    public String getToke(){
      String msg = tokenRediseService.getToken();;
       return  msg;

   }
}
