package com.gfa.todo.repositories;

import com.gfa.todo.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
