package com.example.students.service;


import com.example.students.entity.Students;
import org.springframework.stereotype.Service;
import com.example.students.repository.StudentsRepository;

@Service
public class StudentsService extends BaseService  <Students, StudentsRepository> {
}
