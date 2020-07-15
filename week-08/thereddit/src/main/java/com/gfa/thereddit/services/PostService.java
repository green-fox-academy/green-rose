package com.gfa.thereddit.services;

import com.gfa.thereddit.models.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    List <Post> findAll();
}
