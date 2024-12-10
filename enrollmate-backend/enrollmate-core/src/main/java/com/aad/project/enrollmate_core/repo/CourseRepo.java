package com.aad.project.enrollmate_core.repo;

import com.aad.project.enrollmate_core.data.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {
    List<Course> findAllByInstructor(String instructor);
}
