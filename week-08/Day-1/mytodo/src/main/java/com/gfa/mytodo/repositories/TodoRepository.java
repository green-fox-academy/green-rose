package com.gfa.mytodo.repositories;

import com.gfa.mytodo.models.Todo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoRepository extends CrudRepository<Todo,Long>{
    List<Todo> findByDone(boolean b);

    List<Todo> findByTitleOrContentOrDescriptionContaining(String search1, String search2,String search3);

    List<Todo> findByAssignee_Id(Long id);
}
