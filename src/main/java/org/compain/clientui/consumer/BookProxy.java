package org.compain.clientui.consumer;

import org.compain.clientui.model.Book;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.util.List;
import java.util.Map;

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

    public List<Book> search(String token, Map<String, String> uriParam){

        String url = "http://localhost:8081/api/books/search/?title={title}&authorName={authorName}&category={category}";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.set(HttpHeaders.AUTHORIZATION,"Bearer " + token);
        HttpEntity<String> request = new HttpEntity<>(header);
        ResponseEntity<List<Book>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, request, new ParameterizedTypeReference<List<Book>>() {} , uriParam);
        return responseEntity.getBody();
    }

    public Book getBookById(String token, Long idBook) {
        String url = "http://localhost:8081/api/books/book/?idBook={idBook}";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.set(HttpHeaders.AUTHORIZATION,"Bearer " + token);
        HttpEntity<String> request = new HttpEntity<>(header);
        ResponseEntity<Book> responseEntity = restTemplate.exchange(url, HttpMethod.GET, request, new ParameterizedTypeReference<Book>() {} , idBook);
        return responseEntity.getBody();

    }
}
