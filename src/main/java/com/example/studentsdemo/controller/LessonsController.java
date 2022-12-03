package com.example.students.controller;

import com.example.students.entity.Lessons;
import com.example.students.service.LessonsService;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/lessons")
public class LessonsController extends BaseController<Lessons, LessonsService>{



}
