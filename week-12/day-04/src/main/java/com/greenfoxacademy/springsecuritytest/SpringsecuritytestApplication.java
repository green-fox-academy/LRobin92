package com.greenfoxacademy.springsecuritytest;

import com.greenfoxacademy.springsecuritytest.interfaces.ApiInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SpringBootApplication
public class SpringsecuritytestApplication  {

  public static void main(String[] args) {
    SpringApplication.run(SpringsecuritytestApplication.class, args);
  }

}
