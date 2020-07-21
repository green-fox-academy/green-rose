package com.gfa.frontend.services;

import com.gfa.frontend.models.Log;
import com.gfa.frontend.repositories.LogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {
    private final LogRepository logRepository;

    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public List<Log> findAll(Integer pageNo) {
        return null;
    }

    @Override
    public Log findById(Long id) {
        return null;
    }

    @Override
    public void save(Log log) {
        this.logRepository.save(log);
    }
}
