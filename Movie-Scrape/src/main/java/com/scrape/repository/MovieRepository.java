package com.scrape.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scrape.model.Movie;

	public interface MovieRepository extends JpaRepository<Movie, Integer> {

		Movie save(Movie movie);

		void delete(Movie movie);

		List<Movie> findAll();

	//	Movie findOne(int id);

	}
