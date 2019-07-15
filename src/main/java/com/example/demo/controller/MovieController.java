package com.example.demo.controller;

import com.example.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/")
    public ModelAndView mainPage(/*List<MovieDto> movieDtos*/) {
        ModelAndView modelAndView = new ModelAndView("mainPage");
        modelAndView.addObject("movies", movieService.getAllMovies());
        return modelAndView;
    }
}
