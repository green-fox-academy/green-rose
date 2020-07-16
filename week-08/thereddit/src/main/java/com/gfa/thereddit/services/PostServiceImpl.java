package com.gfa.thereddit.services;

import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements  PostService{
    private final PostRepository postRepository;

    public  PostServiceImpl(PostRepository postRepository){
        this.postRepository = postRepository;
    }
    @Override
    public List<Post> findAll() {
      return (List<Post>) this.postRepository.findAll();
    }

    @Override
    public Post findById(Long id) {
        return this.postRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Post post) {
        this.postRepository.save(post);
    }
}
