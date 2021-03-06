package org.compain.clientui.consumer;


import org.compain.clientui.model.User;
import org.compain.clientui.model.UserLogin;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class UserProxy {

    @Value("${backend.base-url}")
    private String url;

    private final RestTemplate restTemplate;

    public UserProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getToken(UserLogin userLogin) {

        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<UserLogin> request = new HttpEntity<>(userLogin, header);
        ResponseEntity<String> response = restTemplate.exchange(url + "connexion/login", HttpMethod.POST, request, String.class);
        return response.getBody();
    }

    public User createUser(User user) {
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<User> request = new HttpEntity<>(user, header);
        ResponseEntity<User> response = restTemplate.exchange(url +"connexion/signup", HttpMethod.POST,request,User.class);
        return response.getBody();
    }
}
