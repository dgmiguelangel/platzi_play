package com.platzi.play.persistence.crud;

import com.platzi.play.persistence.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {
    // Translate Spring Data JPA method name to SQL query
    MovieEntity findFirstByTitulo(String titulo);
}
