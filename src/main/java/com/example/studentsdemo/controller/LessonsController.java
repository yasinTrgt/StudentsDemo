package com.example.studentsdemo.controller;

import com.example.studentsdemo.entity.Lessons;
import com.example.studentsdemo.entity.Students;
import com.example.studentsdemo.repository.LessonsRepository;
import com.example.studentsdemo.service.LessonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/lessons")
public class LessonsController extends BaseController<Lessons, LessonsService>{

    @Autowired
    LessonsRepository repository;

    @GetMapping()
    public List<Lessons> getAll () {  return repository.findAllLessons();}





}
