package com.gfa.frontend.services;

import com.gfa.frontend.models.Log;
import com.gfa.frontend.models.LogPage;
import com.gfa.frontend.repositories.LogRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
    private final LogRepository logRepository;

    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public LogPage findAll(Integer pageNo, Integer countLog) {
        Page<Log> page = this.logRepository.findAll(
                PageRequest.of(pageNo, countLog, Sort.by(Sort.Direction.DESC, "createdAt")));
        LogPage logPage = new LogPage(page.getContent(), page.getTotalPages(), page.getTotalElements());
        return logPage;

    }

    @Override
    public void save(Log log) {
        this.logRepository.save(log);
    }
}
