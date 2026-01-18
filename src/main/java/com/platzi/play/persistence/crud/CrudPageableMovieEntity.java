package com.platzi.play.persistence.crud;

import com.platzi.play.persistence.entity.MovieEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CrudPageableMovieEntity extends PagingAndSortingRepository<MovieEntity, Long> {
}