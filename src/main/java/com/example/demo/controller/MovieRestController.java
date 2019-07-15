package com.example.demo.controller;

import com.example.demo.dto.MovieDto;
import com.example.demo.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MovieRestController {

    private final MovieService movieService;

    @GetMapping("/api")
    @ResponseBody
    public List<MovieDto> apiPage() {
        return movieService.getAllMovies();
    }
}
