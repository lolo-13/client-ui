package org.compain.clientui.consumer;

import com.fasterxml.jackson.databind.SerializationFeature;
import org.compain.clientui.model.UserLogin;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;
import java.util.Map;


public class UserProxy {

    private String urlAuth = "http://localhost:8081/api/connexion/login";
    private final RestTemplate restTemplate;

    public UserProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getToken(UserLogin userLogin) {

       // ClientHttpRequestFactory factory = new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory());
       // RestTemplate restTemplate = new RestTemplate(factory);
       // MappingJackson2HttpMessageConverter jsonHttpMessageConverter = new MappingJackson2HttpMessageConverter();
       // jsonHttpMessageConverter.getObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
       // restTemplate.getMessageConverters().add(jsonHttpMessageConverter);

        HttpHeaders header = new HttpHeaders();
        header.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<UserLogin> request = new HttpEntity<>(userLogin, header);
        return restTemplate.postForObject(urlAuth, request, String.class);
    }
}
