package com.gfa.frontend.services;

import com.gfa.frontend.models.Log;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogService {
    List<Log> findAll(Integer pageNo);
    Log findById(Long id);
    void save(Log log);
}
