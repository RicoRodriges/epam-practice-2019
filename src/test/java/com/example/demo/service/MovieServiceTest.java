package com.example.demo.service;

import com.example.demo.dao.MovieEntity;
import com.example.demo.dto.MovieDto;
import com.example.demo.repository.MovieRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MovieServiceTest {

    @InjectMocks
    private MovieService movieService;
    @Mock
    private MovieRepository movieRepository;

    @Test
    public void testGetAllMovies() {
        when(movieRepository.findAll()).thenReturn(Arrays.asList(new MovieEntity("", "name1")));

        List<MovieDto> actial = movieService.getAllMovies();

        Assert.assertEquals(1, actial.size());
        Assert.assertEquals("name1", actial.get(0).getName());
        verify(movieRepository, times(1)).findAll();
        verifyNoMoreInteractions(movieRepository);
    }
}
