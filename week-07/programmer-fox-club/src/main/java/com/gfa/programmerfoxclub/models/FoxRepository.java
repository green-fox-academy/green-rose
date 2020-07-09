package com.gfa.programmerfoxclub.models;

import com.gfa.programmerfoxclub.Fox;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FoxRepository {
    List<Fox> findAll();

    void add(String foxName);

    Fox findById(int id);

    void save(Fox fox);

    void remove(Fox fox);

    Fox findByName(String name);
}
