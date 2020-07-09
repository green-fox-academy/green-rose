package com.gfa.programmerfoxclub.models;
import com.gfa.programmerfoxclub.Fox;

import java.util.List;

public interface FoxService {
    List<Fox> foxList();
    Fox getFox(int id);
    void addFoxName(String name);
    void addFox(Fox fox);
    Fox getFoxByName(String name);

}
