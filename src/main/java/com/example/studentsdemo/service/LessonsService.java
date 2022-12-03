package com.example.students.service;

import com.example.students.entity.Lessons;
import com.example.students.repository.LessonsRepository;
import org.springframework.stereotype.Service;

@Service
public class LessonsService extends BaseService <Lessons, LessonsRepository> {
}
