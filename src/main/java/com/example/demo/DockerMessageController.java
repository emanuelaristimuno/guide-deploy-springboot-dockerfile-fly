/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Emanuel
 */
@RestController
public class DockerMessageController {
    @GetMapping("/mensaje")
    public String getMessage() {
        return "Dockerizando Springboot con despliegue en Fly.io... ;)!";
    }
}
