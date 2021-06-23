package org.compain.clientui.consumer;

import org.compain.clientui.model.Book;
import org.compain.clientui.model.User;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Component
public class BookProxy {

    public List<Book> getBooks(String token){
        String url = "http://localhost:8081/api/books";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.set(HttpHeaders.AUTHORIZATION,"Bearer " + token);
        HttpEntity<String> request = new HttpEntity<>(header);
        ResponseEntity<List<Book>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, request, new ParameterizedTypeReference<List<Book>>() {});
        return  responseEntity.getBody();
    }
}
