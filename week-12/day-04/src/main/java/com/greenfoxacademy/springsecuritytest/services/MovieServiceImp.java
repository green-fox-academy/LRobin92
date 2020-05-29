package com.greenfoxacademy.springsecuritytest.services;

import com.greenfoxacademy.springsecuritytest.dtos.MovieDTO;
import com.greenfoxacademy.springsecuritytest.interfaces.ApiInterface;
import java.util.List;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MovieServiceImp implements MovieService {

  public static String BASE_URL = "https://developers.themoviedb.org";
  public static int PAGE = 1;
  public static String API_KEY = "bf97d990f803c4a7dff6c49860ab83ff";
  public static String LANGUAGE = "en-US";

  Retrofit retrofit = new Retrofit.Builder()
      .baseUrl(BASE_URL)
      .addConverterFactory(GsonConverterFactory.create())
      .build();

  ApiInterface myInterface = retrofit.create(ApiInterface.class);


  @Override
  public void updateMovies() {

  }

  @Override
  public List<MovieDTO> getMovies() {
    return null;
  }
}

//
