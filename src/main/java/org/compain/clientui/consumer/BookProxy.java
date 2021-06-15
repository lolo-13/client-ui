package org.compain.clientui.consumer;

import org.compain.clientui.model.Book;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Component
public class BookProxy {

    public List<Book> getBooks(){
        String url = "http://localhost:8081/api/books";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Book>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Book>>() {});
        return  responseEntity.getBody();
    }
}
