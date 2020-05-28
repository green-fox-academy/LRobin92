package com.greenfoxacademy.springsecuritytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SpringBootApplication
public class SpringsecuritytestApplication  {

  
  public static String BASE_URL = "https://developers.themoviedb.org";

  public static void main(String[] args) {
    SpringApplication.run(SpringsecuritytestApplication.class, args);

    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    ApiInterface apiInterface = retrofit.create(ApiInterface.class);
  }

}
