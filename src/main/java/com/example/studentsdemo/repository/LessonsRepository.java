package com.example.students.repository;

import com.example.students.entity.Lessons;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonsRepository extends BaseRepository<Lessons>, JpaSpecificationExecutor<Lessons> {

}
