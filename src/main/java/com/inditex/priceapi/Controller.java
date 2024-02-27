package com.inditex.priceapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("v1")
    private String getName(){
        return "Hola Guillemet, INDITEX!";
    }
}
