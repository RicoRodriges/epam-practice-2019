package com.example.demo.repository;

import com.example.demo.dto.MovieApiDto;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Repository
public class MovieApi {
    private static final String URL = "https://api.themoviedb.org/3/search/movie";
    private static final String TOKEN = "YOUR API KEY";

    private final RestTemplate restTemplate;

    public MovieApi() {
        this.restTemplate = new RestTemplate();
    }

    public MovieApiDto findByQuery(String query) {
        UriComponents uriBuilder = UriComponentsBuilder.fromHttpUrl(URL)
                .queryParam("api_key", TOKEN)
                .queryParam("language", "ru-RU")
                .queryParam("page", "1")
                .queryParam("include_adult", "false")
                .queryParam("query", query)
                .build();
        return restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, null, MovieApiDto.class).getBody();
    }
}
