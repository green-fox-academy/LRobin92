package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;

public interface PostService {
  Iterable<Post> getAllPosts();
  void savePost(Post post);
  void upVoteScore(Long id);
  void downVoteScore(Long id);

}
