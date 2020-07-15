package com.gfa.thereddit.services;

import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List <User> findAll();
    User findById(Long id);

    void save(User user);

}
