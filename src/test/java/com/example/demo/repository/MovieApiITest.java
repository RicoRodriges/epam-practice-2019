package com.example.demo.repository;

import com.example.demo.dto.MovieApiDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieApiITest {

    @Autowired
    private MovieApi movieApi;

    @Test
    public void testFindByQuery() {

        MovieApiDto movies = movieApi.findByQuery("Alad");

        assertThat(movies).isNotNull();
        assertThat(movies.getPage()).isEqualTo(1);
        assertThat(movies.getTotalPages()).isPositive();
        assertThat(movies.getResults()).isNotEmpty();
    }

}
