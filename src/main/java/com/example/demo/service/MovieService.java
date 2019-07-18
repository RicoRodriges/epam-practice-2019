package com.example.demo.service;

import com.example.demo.dto.MovieDto;
import com.example.demo.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MovieService {
    private static final Logger LOG = LoggerFactory.getLogger(MovieService.class);

    private final MovieRepository movieRepository;

    public List<MovieDto> getAllMovies() {
        LOG.trace("trace");
        LOG.debug("debug");
        LOG.info("info");
        LOG.warn("warn");
        LOG.error("error");
        return movieRepository.findAll().stream()
                .map(entity -> new MovieDto(entity.getId(), entity.getName()))
                .collect(Collectors.toList());

    }
}
