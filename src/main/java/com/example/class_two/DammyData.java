package com.example.class_two;

import com.example.class_two.models.Movie;
import com.example.class_two.repositories.MovieRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DammyData implements CommandLineRunner {
    private  final MovieRepository movieRepository;

    public DammyData(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Movie movie = new Movie("Fast and Furious", "2007");
        Movie movie2 = new Movie("Fast and Furious", "2007");

        movieRepository.save(movie);
        movieRepository.save(movie2);

    }
}
