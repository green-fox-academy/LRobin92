package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface RedditPostRepository extends CrudRepository<Post, Long> {
  Post getPostById(Long id);
}
