package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.RedditPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
  private RedditPostRepository repo;

  @Autowired
  public PostServiceImpl(RedditPostRepository repo) {
    this.repo = repo;
  }


  @Override
  public Iterable<Post> getAllPosts() {
    return repo.findAll();
  }

  @Override
  public void savePost(Post post) {
    repo.save(post);
  }

  @Override
  public void upVoteScore(Long id) {
    repo.getPostById(id).increaseScore();
    repo.save(repo.getPostById(id));
  }

  @Override
  public void downVoteScore(Long id) {
    repo.getPostById(id).reduceScore();
    repo.save(repo.getPostById(id));
  }
}
