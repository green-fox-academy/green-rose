package com.gfa.frontend.services;

import com.gfa.frontend.models.Log;
import com.gfa.frontend.models.LogPage;
import org.springframework.stereotype.Service;

@Service
public interface LogService {
    LogPage findAll(Integer pageNo, Integer countLog);
    void save(Log log);
}
