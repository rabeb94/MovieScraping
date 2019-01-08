package com.scrape.controller;

import java.util.List;
import com.scrape.model.Movie;
import com.scrape.security.services.MovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	 public List<Movie>findAll(){
		return movieService.findAll();
    }
    @PostMapping("/movies")
    public Movie create(@RequestBody Movie movie){
        return movieService.create(movie);
    }

    @GetMapping(path = {"/movies/{id}"})
    public Movie findOne(@PathVariable("id") int id){
        return movieService.findById(id);
    }
    @PutMapping(path = {"/movies/{id}"})
    public Movie update(@PathVariable("id") int id, @RequestBody Movie movie){
        movie.setId(id);
        return movieService.update(movie);
    }

    @DeleteMapping(path ={"/movies/{id}"})
    public Movie delete(@PathVariable("id") int id) {
        return movieService.delete(id);
    }


}