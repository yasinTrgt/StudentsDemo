package com.example.studentsdemo.service;


import com.example.studentsdemo.entity.Students;
import org.springframework.stereotype.Service;
import com.example.studentsdemo.repository.StudentsRepository;

@Service
public class StudentsService extends BaseService  <Students, StudentsRepository> {
}
