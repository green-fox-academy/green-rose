package com.gfa.thereddit.services;

import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.models.PostPage;
import com.gfa.thereddit.repositories.PostRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements  PostService{
    private final PostRepository postRepository;

    public  PostServiceImpl(PostRepository postRepository){
        this.postRepository = postRepository;
    }
    @Override
    public PostPage findAll(Integer pageNo) {
        Page<Post> page = this.postRepository.findAll(
                PageRequest.of(pageNo, 2, Sort.by(Sort.Direction.DESC, "votes")));
        PostPage postPage = new PostPage(page.getContent(), page.getTotalPages());
        return postPage;
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
