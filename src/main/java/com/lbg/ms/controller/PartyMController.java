package com.lbg.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartyMController
{

   @GetMapping("/getParty")
   public String getParty()
   {
      
      return "Hello";
   }
}
