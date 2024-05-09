package com.vinimanfrin.openfeign.clients.auth;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class LoginSpotifyResponse {

        private String accessToken;

        public LoginSpotifyResponse() {
        }

        public LoginSpotifyResponse(String accessToken) {
                this.accessToken = accessToken;
        }

        public String getAccessToken() {
                return accessToken;
        }

        public void setAccessToken(String accessToken) {
                this.accessToken = accessToken;
        }
}
