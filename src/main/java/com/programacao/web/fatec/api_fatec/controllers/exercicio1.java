package com.programacao.web.fatec.api_fatec.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//  https://localhost:8090/api/exercicio1

@RestController
@RequestMapping ("/api/exercicio1")

public class exercicio1 {
    
    @GetMapping ("Hello1")
    public String helloworld()
    {
        return "Hello teste";
    }
}
