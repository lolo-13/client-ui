package org.compain.clientui.consumer;

import org.compain.clientui.model.Book;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.util.List;
import java.util.Map;

@Component
public class BookProxy {

    @Value("${backend.base-url}")
    private String url;

    public List<Book> getBooks(String token){

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.set(HttpHeaders.AUTHORIZATION,"Bearer " + token);
        HttpEntity<String> request = new HttpEntity<>(header);
        ResponseEntity<List<Book>> responseEntity = restTemplate.exchange(url + "api/books", HttpMethod.GET, request, new ParameterizedTypeReference<List<Book>>() {});
        return  responseEntity.getBody();
    }

    public List<Book> search(String token, Map<String, String> uriParam){

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.set(HttpHeaders.AUTHORIZATION,"Bearer " + token);
        HttpEntity<String> request = new HttpEntity<>(header);
        ResponseEntity<List<Book>> responseEntity = restTemplate.exchange(url + "api/books/search/?title={title}&authorName={authorName}&category={category}", HttpMethod.GET, request, new ParameterizedTypeReference<List<Book>>() {} , uriParam);
        return responseEntity.getBody();
    }

    public Book getBookById(String token, Long idBook) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.set(HttpHeaders.AUTHORIZATION,"Bearer " + token);
        HttpEntity<String> request = new HttpEntity<>(header);
        ResponseEntity<Book> responseEntity = restTemplate.exchange(url + "api/books/book/?idBook={idBook}", HttpMethod.GET, request, new ParameterizedTypeReference<Book>() {} , idBook);
        return responseEntity.getBody();

    }
}
