package com.example.demo.services;

import com.example.demo.json.User;
import com.example.demo.json.StarWarsCharacter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class InformationServiceImpl implements InformationService {

  private final String resourceUrl = "http://localhost:8080/getDummyInfo";
  private final String resourceStarWarsUrl = "http://swapi.co/api/people/1/";

  @Override
  public String getUser() {
    // Call an API method
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<User> response = restTemplate.getForEntity(this.resourceUrl, User.class);
    return response.getBody().getName();
  }

  @Override
  public StarWarsCharacter getStarWarsCharacter(){
    // Call an API method
    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<StarWarsCharacter> response = restTemplate.getForEntity(this.resourceStarWarsUrl, StarWarsCharacter.class);
    return response.getBody();
  }
}
