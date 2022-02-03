package com.edu.university.repository;

import com.edu.university.entity.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryInscription extends JpaRepository<Inscription, Long> {
}
