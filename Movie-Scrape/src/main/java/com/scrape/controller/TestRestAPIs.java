package com.scrape.controller;

import java.util.List;
import com.scrape.model.Movie;
import com.scrape.security.services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestRestAPIs {
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/api/test/user")
	public String userAccess() {
		return ">>> User Contents!";
	}
	@GetMapping("/movies")
	//@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	 public List<Movie>findAll(){
		return movieService.findAll();
    }

	@GetMapping("/api/test/pm")
	//@PreAuthorize("hasRole('PM') or hasRole('ADMIN')")
	public String projectManagementAccess() {
		return ">>> Project Management Board";
	}
	
	@GetMapping("/api/test/admin")
	@PreAuthorize("hasRole('ADMIN')")
	public String adminAccess() {
		return ">>> Admin Contents";
	}
}