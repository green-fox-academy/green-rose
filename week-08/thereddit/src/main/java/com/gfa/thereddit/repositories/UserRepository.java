package com.gfa.thereddit.repositories;

import com.gfa.thereddit.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends CrudRepository <User, Long> {
  User findByUsernameAndPassword(String username, String password);
}
