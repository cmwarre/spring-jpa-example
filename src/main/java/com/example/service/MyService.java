package com.example.service;

import com.example.model.MyEntity;
import com.example.repository.MyEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyEntityRepository repo;

    @Autowired
    public MyService(MyEntityRepository myRepository) {
        this.repo = myRepository;
    }

    public void save(MyEntity entity) {
        repo.save(entity);
    }

    public Iterable<MyEntity> getAll() {
        return repo.findAll();
    }

}
