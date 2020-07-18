package com.gfa.thereddit.repositories;

import com.gfa.thereddit.models.Post;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
}
