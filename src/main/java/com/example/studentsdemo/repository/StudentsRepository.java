package com.example.studentsdemo.repository;

import com.example.studentsdemo.entity.Lessons;
import com.example.studentsdemo.entity.Students;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsRepository extends BaseRepository<Students>, JpaSpecificationExecutor<Students> {

    @Query("select students from Students students")
    List<Students> findAllStudents();

    @Query("select students  from Students students where students.name like ?1%")
    List<Students> findStudentsName(String name);



}
