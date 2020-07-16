package com.gfa.mytodo.repositories;

import com.gfa.mytodo.models.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssigneeRepository extends CrudRepository<Assignee,Long>{

}
