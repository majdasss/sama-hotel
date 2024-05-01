package com.emsi.bookingsystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TEST {
   @GetMapping("/a")
    public String myf(){ return "hhh"; }
}
