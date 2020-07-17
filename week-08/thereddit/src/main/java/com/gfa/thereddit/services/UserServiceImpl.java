package com.gfa.thereddit.services;

import com.gfa.thereddit.models.User;
import com.gfa.thereddit.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> findAll() {
        return  (List<User>) this.userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
       return this.userRepository.findById(id).orElse(null);
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return this.userRepository.findByUsernameAndPassword(username,password);
    }

    @Override
    public void save(User user) {
        this.userRepository.save(user);
    }
}
