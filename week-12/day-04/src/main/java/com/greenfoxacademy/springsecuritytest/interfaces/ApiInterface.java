package com.greenfoxacademy.springsecuritytest.interfaces;

import com.greenfoxacademy.springsecuritytest.dtos.MovieListDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

  @GET("/3/movie/{category}")
  Call<MovieListDTO> getlistOfMovies(
      @Path("category") String category,
      @Query("api_key") String apiKey,
      @Query("language") String language,
      @Query("page") int page
  );



  //https://api.themoviedb.org/3/movie/popular?api_key=bf97d990f803c4a7dff6c49860ab83ff&language=en-US&page=3
}
