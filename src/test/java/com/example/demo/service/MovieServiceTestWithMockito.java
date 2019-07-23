package com.example.demo.service;

import com.example.demo.dao.MovieEntity;
import com.example.demo.dto.MovieDto;
import com.example.demo.repository.MovieRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;

public class MovieServiceTestWithMockito {

    private MovieRepository movieRepository = mock(MovieRepository.class);
    private MovieService movieService = new MovieService(movieRepository);

    @Test
    public void testGetAllMovies() {
        when(movieRepository.findAll()).thenReturn(Collections.singletonList(new MovieEntity("", "name1")));

        List<MovieDto> actial = movieService.getAllMovies();

        Assert.assertEquals(1, actial.size());
        Assert.assertEquals("name1", actial.get(0).getName());
        verify(movieRepository, times(1)).findAll();
        verifyNoMoreInteractions(movieRepository);
    }
}
