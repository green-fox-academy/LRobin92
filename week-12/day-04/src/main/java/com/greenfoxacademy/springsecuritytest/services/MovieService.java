package com.greenfoxacademy.springsecuritytest.services;


import com.greenfoxacademy.springsecuritytest.dtos.MovieDTO;
import java.util.List;

public interface MovieService {

  void updateMovies();

  List<MovieDTO> getMovies();

}
