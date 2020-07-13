package com.gfa.mytodo.repositories;

import com.gfa.mytodo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoRepository extends CrudRepository<Todo,Long>{

    List<Todo> findByDone(boolean b);
}
