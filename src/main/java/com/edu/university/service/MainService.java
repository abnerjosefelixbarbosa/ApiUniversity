package com.edu.university.service;

import com.edu.university.entity.Inscription;
import com.edu.university.entity.Student;
import com.edu.university.repository.RepositoryInscription;
import com.edu.university.repository.RepositoryStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    @Autowired
    private RepositoryInscription ri;
    @Autowired
    private RepositoryStudent rs;

    public Inscription saveInscription(Inscription data) {
        return ri.save(data);
    }

    public Student saveStudent(Student data) {
        return rs.save(data);
    }

    public List<Inscription> listInscription() {
        return ri.findAll();
    }

    public List<Student> listStudent() {
        return rs.findAll();
    }

    public Student getStudent(long id) {return rs.findById(id).get();}

    public Student editStudent(long id) {return rs.findById(id).get();}
}
