package com.scrape.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scrape.model.Movie;
import com.scrape.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	  @Autowired
	    private MovieRepository repository;

	@Override
	public Movie create(Movie movie) {
		return repository.save(movie);
	}

	@Override
	public Movie delete(int id) {
		 Movie movie = findById(id);
	        if(movie != null){
	            repository.delete(movie);
	        }
	        return movie;
	}

	@Override
	public List<Movie> findAll() {
		 return repository.findAll();
	}

	@Override
	public Movie findById(int id) {
		return null;
 
	}

	@Override
	public Movie update(Movie movie) {
		 return repository.save(movie);
	}
	

}
