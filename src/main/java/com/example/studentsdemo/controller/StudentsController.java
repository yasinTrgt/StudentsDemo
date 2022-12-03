package com.example.studentsdemo.controller;


import com.example.studentsdemo.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.studentsdemo.repository.StudentsRepository;
import com.example.studentsdemo.service.StudentsService;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentsController extends BaseController<Students, StudentsService> {


    @Autowired
    StudentsRepository repository;

    @GetMapping()
    public List<Students> getAll(){
        return repository.findAllStudents();
    }


    @GetMapping("search/{search_word}")
    public List<Students> search(@PathVariable String search_word ) {return repository.findStudentsName(search_word);}

    @GetMapping("/{studentsId}")
    public Optional<Students> getById(@PathVariable  Long studentsId) {return repository.findById(studentsId);}





}
