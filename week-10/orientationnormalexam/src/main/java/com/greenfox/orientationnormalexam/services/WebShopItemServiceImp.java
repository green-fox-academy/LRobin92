package com.greenfox.orientationnormalexam.services;

import com.greenfox.orientationnormalexam.repositories.WebShopItemRepository;
import org.springframework.stereotype.Service;

@Service
public class WebShopItemServiceImp implements WebShopItemService{
  private WebShopItemRepository repo;

  public WebShopItemServiceImp(WebShopItemRepository repo) {
    this.repo = repo;
  }
}
