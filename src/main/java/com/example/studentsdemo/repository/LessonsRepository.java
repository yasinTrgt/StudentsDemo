package com.example.studentsdemo.repository;

import com.example.studentsdemo.entity.Lessons;
import com.example.studentsdemo.entity.Students;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonsRepository extends BaseRepository<Lessons>, JpaSpecificationExecutor<Lessons> {

    @Query("select lessons from Lessons lessons")
    List<Lessons> findAllLessons();

}
