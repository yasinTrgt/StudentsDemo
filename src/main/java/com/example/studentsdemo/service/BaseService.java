package com.example.students.service;


import com.example.students.entity.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.students.repository.BaseRepository;

import java.util.List;

public class BaseService<T extends BaseEntity, R extends BaseRepository> {


    @Autowired
    public R repository;


    public List<T> findAll() {
        List<T> entityList = repository.findAll();

        return entityList;
    }

    public T save(T t) {
        return (T) repository.save(t);
    }

    public void delete(Long entityId) {
        repository.delete(entityId);
    }
}
