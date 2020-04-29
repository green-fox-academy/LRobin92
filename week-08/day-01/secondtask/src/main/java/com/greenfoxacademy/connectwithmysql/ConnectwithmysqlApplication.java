package com.greenfoxacademy.connectwithmysql;

import com.greenfoxacademy.connectwithmysql.model.Todo;
import com.greenfoxacademy.connectwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectwithmysqlApplication  implements CommandLineRunner {
  private TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(ConnectwithmysqlApplication.class, args);
  }

  @Autowired
  public ConnectwithmysqlApplication(TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Daily task", true,true));
    todoRepository.save(new Todo("Make the bed", false,false));
    todoRepository.save(new Todo("Do the washing up", false, true));
    todoRepository.save(new Todo("Vacuum the carpet", false, false));
    todoRepository.save(new Todo("Walk the dog", true, true));
  }
}
