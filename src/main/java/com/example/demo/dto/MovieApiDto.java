package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MovieApiDto {
    private Long page;
    @JsonProperty("total_pages")
    private Long totalPages;
    private List<Movie> results;

    public static class Movie {
        @JsonProperty("title")
        private String name;
    }
}
