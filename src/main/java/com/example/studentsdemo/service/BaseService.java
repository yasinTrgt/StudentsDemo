package com.example.studentsdemo.service;


import com.example.studentsdemo.entity.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.studentsdemo.repository.BaseRepository;

import java.util.List;
import java.util.Optional;


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

    public void delete(Long id) {
        repository.deleteById(id);
    }
    public T update(Long entityId, T entity) {
        Optional<T> optionalT = repository.findById(entityId);

        if (optionalT.isPresent()) {
            entity.setId(entityId);
            repository.save(entity);

        }

        return entity;
    }
}
