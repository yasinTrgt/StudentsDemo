package com.example.students.controller;


import com.example.students.entity.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.students.repository.StudentsRepository;
import com.example.students.service.StudentsService;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/students")
public class StudentsController extends BaseController<Students, StudentsService> {


    @Autowired
    StudentsRepository repository;

    @GetMapping()
    public List<Students> getAll(){return repository.findAllStudents(); }

    @GetMapping("search/{search_word}")
    public List<Students> search(@PathVariable String search_word ) {return repository.findStudentsName(search_word);}

    @GetMapping("/{studentsId}")
    public Optional<Students> getById(@PathVariable  Long studentsId) {return repository.findById(studentsId);}





}
