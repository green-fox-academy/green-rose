package com.gfa.mytodo.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "assignee")
    private List<Todo> todos;

    public Assignee() {
    }

    public Assignee(String email) {
        this.email=email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
