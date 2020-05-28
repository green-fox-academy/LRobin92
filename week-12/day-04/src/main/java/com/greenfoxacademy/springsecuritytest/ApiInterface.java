package com.greenfoxacademy.springsecuritytest;

import com.greenfoxacademy.springsecuritytest.models.MovieResults;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

  @GET("/3/movie/{category}")
  Call<MovieResults> listOfMovies(
      @Path("category") String category,
      @Query("api_key") String apiKey,
      @Query("language") String language,
      @Query("page") int page
  );



  //https://api.themoviedb.org/3/movie/popular?api_key=bf97d990f803c4a7dff6c49860ab83ff&language=en-US&page=3
}
