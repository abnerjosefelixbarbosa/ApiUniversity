package com.edu.university.controller;

import com.edu.university.entity.Inscription;
import com.edu.university.entity.Student;
import com.edu.university.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/university")
public class MainController {
    @Autowired
    private MainService ms;

    @PostMapping(value = "/inscription")
    public ResponseEntity<Inscription> saveInscription(@Valid @RequestBody Inscription data) {
        Inscription val = ms.saveInscription(data);
        return new ResponseEntity<Inscription>(val,HttpStatus.OK);
    }

    @PostMapping(value = "/student")
    public ResponseEntity<Student> saveStudent(@Valid @RequestBody Student data) {
        Student val = ms.saveStudent(data);
        return new ResponseEntity<Student>(val,HttpStatus.OK);
    }

    @GetMapping(value = "/inscription")
    public ResponseEntity<List<Inscription>> listInscription() {
        List<Inscription> l = ms.listInscription();
        return new ResponseEntity<List<Inscription>>(l,HttpStatus.OK);
    }

    @GetMapping(value = "/student")
    public ResponseEntity<List<Student>> listStudent() {
        List<Student> l = ms.listStudent();
        return new ResponseEntity<List<Student>>(l, HttpStatus.OK);
    }

    @PutMapping(value = "/student")
    public ResponseEntity<Student> editStudent(@Valid @RequestBody Student data) {
        Student val = ms.saveStudent(data);
        return new ResponseEntity<Student>(val,HttpStatus.OK);
    }
}
