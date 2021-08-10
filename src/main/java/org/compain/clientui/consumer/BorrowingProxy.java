package org.compain.clientui.consumer;

import org.compain.clientui.model.Borrowing;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class BorrowingProxy {

    @Value("${backend.base-url}")
    private String url;

    private final RestTemplate restTemplate;

    public BorrowingProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Borrowing> getUserBorrowing(String token) {
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.set(HttpHeaders.AUTHORIZATION,"Bearer " + token);
        HttpEntity<String> request = new HttpEntity<>(header);
        ResponseEntity<List<Borrowing>> response = restTemplate.exchange(url + "api/borrowings/user", HttpMethod.GET, request, new ParameterizedTypeReference<List<Borrowing>>() {});
        return  response.getBody();
    }

    public Void renewalBorrowing(String token, Long idBorrowing) {
        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        header.set(HttpHeaders.AUTHORIZATION,"Bearer " + token);
        HttpEntity<Long> request = new HttpEntity(idBorrowing, header);
        ResponseEntity<Void> response = restTemplate.exchange(url + "api/borrowings/borrowing-prolongation", HttpMethod.POST, request, Void.class);
        return response.getBody();
    }

}
