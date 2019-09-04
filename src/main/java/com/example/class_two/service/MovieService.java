package com.example.class_two.service;

import com.example.class_two.models.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();
    Movie findById(Long id);

    Movie create(Movie movie);
    void delete(Long id);
    Movie update(Movie movie);
    Movie update(Long id, Movie movie);


}
