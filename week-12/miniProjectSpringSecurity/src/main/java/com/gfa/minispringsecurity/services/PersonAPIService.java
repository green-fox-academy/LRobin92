package com.gfa.minispringsecurity.services;

import com.gfa.minispringsecurity.DTO.PersonDTO;
import com.gfa.minispringsecurity.interfaces.GetPerson;
import com.gfa.minispringsecurity.repositories.PeopleRepository;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class PersonAPIService {

  @Autowired
  private PeopleRepository peopleRepository;

  public PersonDTO fetch(int id) throws IOException {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

    GetPerson getPerson = retrofit.create(GetPerson.class);

    Call<PersonDTO> person = getPerson.getThePerson(id);

    Response<PersonDTO> execute = person.execute();

    PersonDTO p = execute.body();

    this.peopleRepository.save(p);

    return p;
  }

  public List<PersonDTO> findAllPeople(){
    return this.peopleRepository.findAllBy();
  }
}
