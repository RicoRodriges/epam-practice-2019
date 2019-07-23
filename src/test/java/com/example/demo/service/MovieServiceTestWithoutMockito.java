package com.example.demo.service;

import com.example.demo.dao.MovieEntity;
import com.example.demo.dto.MovieDto;
import com.example.demo.repository.MovieRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class MovieServiceTestWithoutMockito {

    private MovieService movieService = new MovieService(new MovieRepositoryMock());

    @Test
    public void testGetAllMovies() {
        List<MovieDto> actial = movieService.getAllMovies();

        Assert.assertEquals(1, actial.size());
        Assert.assertEquals("name1", actial.get(0).getName());
    }

    private static class MovieRepositoryMock implements MovieRepository {

        @Override
        public List<MovieEntity> findAll() {
            return Collections.singletonList(new MovieEntity("", "name1"));
        }

        @Override
        public String someNativeCustomQuery(MovieEntity movieEntity) {
            return null;
        }

        @Override
        public Set<MovieEntity> someHibernateCustomQuery(MovieEntity movieEntity) {
            return null;
        }

        @Override
        public List<MovieEntity> findAll(Sort sort) {
            return null;
        }

        @Override
        public Page<MovieEntity> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public List<MovieEntity> findAllById(Iterable<String> iterable) {
            return null;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(String s) {

        }

        @Override
        public void delete(MovieEntity movieEntity) {

        }

        @Override
        public void deleteAll(Iterable<? extends MovieEntity> iterable) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public <S extends MovieEntity> S save(S s) {
            return null;
        }

        @Override
        public <S extends MovieEntity> List<S> saveAll(Iterable<S> iterable) {
            return null;
        }

        @Override
        public Optional<MovieEntity> findById(String s) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(String s) {
            return false;
        }

        @Override
        public void flush() {

        }

        @Override
        public <S extends MovieEntity> S saveAndFlush(S s) {
            return null;
        }

        @Override
        public void deleteInBatch(Iterable<MovieEntity> iterable) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public MovieEntity getOne(String s) {
            return null;
        }

        @Override
        public <S extends MovieEntity> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends MovieEntity> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends MovieEntity> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public <S extends MovieEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends MovieEntity> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends MovieEntity> boolean exists(Example<S> example) {
            return false;
        }
    }
}
