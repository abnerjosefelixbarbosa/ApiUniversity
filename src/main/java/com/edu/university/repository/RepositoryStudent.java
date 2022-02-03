package com.edu.university.repository;

import com.edu.university.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryStudent extends JpaRepository<Student, Long> {
}
