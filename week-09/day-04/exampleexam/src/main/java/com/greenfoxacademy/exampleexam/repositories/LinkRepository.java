package com.greenfoxacademy.exampleexam.repositories;

import com.greenfoxacademy.exampleexam.models.Link;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LinkRepository extends CrudRepository <Link, Long> {
  List<Link> findAllBy();
  @Query(value = "select link FROM Link link WHERE link.alias = :alias" )
  Optional<Link> getLinkByAlias(String alias);
}
