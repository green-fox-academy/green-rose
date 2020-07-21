package com.gfa.frontend.repositories;

import com.gfa.frontend.models.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository <Log, Long>{
}
