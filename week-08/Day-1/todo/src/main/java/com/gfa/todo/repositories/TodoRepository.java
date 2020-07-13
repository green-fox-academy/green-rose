package com.gfa.todo.repositories;

import com.gfa.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface TodoRepository extends CrudRepository<Todo,Long>{

}
