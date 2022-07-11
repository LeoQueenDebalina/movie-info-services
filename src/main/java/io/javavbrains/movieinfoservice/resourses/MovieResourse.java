package io.javavbrains.movieinfoservice.resourses;

import io.javavbrains.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class MovieResourse {
    @GetMapping("/movies/{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId){
        return new Movie(movieId,"Test name");

    }
}
