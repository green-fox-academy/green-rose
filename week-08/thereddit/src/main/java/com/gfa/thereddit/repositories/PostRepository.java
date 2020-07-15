package com.gfa.thereddit.repositories;

import com.gfa.thereddit.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends CrudRepository <Post, Long> {

}
