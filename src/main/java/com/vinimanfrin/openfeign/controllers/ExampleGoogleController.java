package com.vinimanfrin.openfeign.controllers;

import com.vinimanfrin.openfeign.clients.GoogleClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleGoogleController {

    private final GoogleClient googleClient;

    public ExampleGoogleController(GoogleClient googleClient) {
        this.googleClient = googleClient;
    }

    @GetMapping("/google")
    public ResponseEntity<String> googleHome(){
        return ResponseEntity.ok(googleClient.googleHome());
    }
}
