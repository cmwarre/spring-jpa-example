package com.example.model;

import javax.persistence.*;

@Entity
@Table(name="MYENTITY")
public class MyEntity {

    public MyEntity() {

    }

    public MyEntity(String name){
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name="name")
    public String name;

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
}
