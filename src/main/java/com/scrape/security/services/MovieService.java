package com.scrape.security.services;

import java.util.List;

import com.scrape.model.Movie;


public interface MovieService {
	
	Movie create(Movie movie);

	Movie delete(int id);

	List<Movie> findAll();

	Movie findById(int id);

	Movie update(Movie movie);

}
