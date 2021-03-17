package com.example.demojavams.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GetController {

    @GetMapping(path="/getmapping")
    public ResponseEntity getMappingExample(){
        return new ResponseEntity("Welcome to getMapping springboot example ", HttpStatus.OK);
    }

}
