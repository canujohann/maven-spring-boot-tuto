package com.example.demo.services;

import com.example.demo.json.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class InformationServiceImpl implements InformationService {

  private final String resourceUrl = "http://localhost:8080/getDummyInfo";

  @Override
  public String getUser() {
    // Call an API method
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<User> response = restTemplate.getForEntity(this.resourceUrl, User.class);
    return response.getBody().getName();
  }
}
