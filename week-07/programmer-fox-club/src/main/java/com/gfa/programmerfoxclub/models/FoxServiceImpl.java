package com.gfa.programmerfoxclub.models;
import com.gfa.programmerfoxclub.Fox;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoxServiceImpl implements FoxService{

    private final FoxRepository foxRepository;

    public FoxServiceImpl(FoxRepository foxRepository) {
        this.foxRepository = foxRepository;
    }

    public List<Fox> foxList() {
        return null;
    }

    public Fox getFox(int id) {
        return null;
    }

    public void addFoxName(String name) {
        foxRepository.add(name);
    }

    public void addFox(Fox fox) {

    }

    public Fox getFoxByName(String name) {
        return this.foxRepository.findByName(name);
    }

}
