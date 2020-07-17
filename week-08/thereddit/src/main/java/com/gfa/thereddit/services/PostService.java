package com.gfa.thereddit.services;

import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.models.PostPage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {
    PostPage findAll(Integer pageNo);
    Post findById(Long id);

    void save(Post post);
}
