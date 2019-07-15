package com.example.demo.service;

import com.example.demo.dto.MovieDto;
import com.example.demo.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public List<MovieDto> getAllMovies() {
        return movieRepository.findAll().stream()
                .map(entity -> new MovieDto(entity.getId(), entity.getName()))
                .collect(Collectors.toList());

    }
}
