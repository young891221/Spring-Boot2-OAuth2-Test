package com.example.boot2oauth;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KimYJ on 2018-04-12.
 */
@RestController
public class LoginController {

    @GetMapping("/loginSuccess")
    public Object getLoginInfo(OAuth2AuthenticationToken authentication) {
        return authentication.getPrincipal().getAttributes();
    }
}
