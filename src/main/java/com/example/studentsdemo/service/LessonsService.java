package com.example.studentsdemo.service;

import com.example.studentsdemo.entity.Lessons;
import com.example.studentsdemo.repository.LessonsRepository;
import org.springframework.stereotype.Service;

@Service
public class LessonsService extends BaseService <Lessons, LessonsRepository> {
}
