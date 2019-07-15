package com.example.demo.repository;

import com.example.demo.dao.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface MovieRepository extends JpaRepository<MovieEntity, String> {

    @Query(value = "SELECT id FROM movie_entity", nativeQuery = true)
    String someNativeCustomQuery(MovieEntity movieEntity);

    @Query("FROM MovieEntity")
    Set<MovieEntity> someHibernateCustomQuery(MovieEntity movieEntity);
}
