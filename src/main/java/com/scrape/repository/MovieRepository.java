package com.scrape.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.scrape.model.Movie;

	public interface MovieRepository extends Repository<Movie, Integer> {

		Movie save(Movie movie);

		void delete(Movie movie);

		List<Movie> findAll();

		Movie findById(int id);

	}
