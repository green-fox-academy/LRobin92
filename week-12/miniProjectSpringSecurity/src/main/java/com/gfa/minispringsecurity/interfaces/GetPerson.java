package com.gfa.minispringsecurity.interfaces;

import com.gfa.minispringsecurity.DTO.PersonDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GetPerson {

  @GET("/3/person/{id}?api_key=9e739c39e482e75696811b5a59b76ecc&language=en-US")
  Call<PersonDTO> getThePerson(@Path("id") int id);

}
