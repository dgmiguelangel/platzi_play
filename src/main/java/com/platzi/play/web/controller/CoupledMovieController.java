package com.platzi.play.web.controller;

import com.platzi.play.persistence.crud.CrudMovieEntity;
import com.platzi.play.persistence.entity.MovieEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoupledMovieController {

    // Dependency tightly coupled to the persistence layer
    private final CrudMovieEntity crudMovieEntity;

    public CoupledMovieController(CrudMovieEntity crudMovieEntity) {
        this.crudMovieEntity = crudMovieEntity;
    }

    /*
    @GetMapping("/movies")
    public List<MovieEntity> getAll() {
        return (List<MovieEntity>) this.crudMovieEntity.findAll();
    }

    @GetMapping("/movies")
    public List<MovieEntity> getAll(@RequestParam("page") int page) {
        Pageable pageable = PageRequest.of(page, 2);
        return this.crudMovieEntity.findAll(pageable).stream().toList();
    }
    */

}