package com.gfa.thereddit.services;

import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements  PostService{
    private PostRepository postRepository;

    public  PostServiceImpl(PostRepository postRepository){
        this.postRepository = postRepository;
    }
    @Override
    public List<Post> findAll() {
      return (List<Post>) this.postRepository.findAll();
    }
}
