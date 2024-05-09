package com.vinimanfrin.openfeign.controllers;

import com.vinimanfrin.openfeign.clients.auth.AuthSpotifyClient;
import com.vinimanfrin.openfeign.clients.auth.LoginSpotifyRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify/api")
public class SpotifyController {

    private final AuthSpotifyClient authSpotifyCLient;

    public SpotifyController(AuthSpotifyClient authSpotifyCLient) {
        this.authSpotifyCLient = authSpotifyCLient;
    }

    @GetMapping("/login")
    public ResponseEntity<String> getToken(){

        LoginSpotifyRequest loginSpotifyRequest = new LoginSpotifyRequest(
                          "client_credentials",
                            "65155aa04a1d42d6a1a631ec078798fd",
                         "7489cefb2ea545d48d67f3130573c857"

        );

        return ResponseEntity.ok(authSpotifyCLient.login(loginSpotifyRequest).getAccessToken());
    }
}
