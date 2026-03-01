package com.example.student_management.controller;

import com.example.student_management.entity.Student;
import com.example.student_management.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository repo;

    public StudentController(StudentRepository repo) {
        this.repo = repo;
    }

    // CREATE
    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return repo.save(student);
    }

    // READ ALL
    @GetMapping
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // SEARCH BY NAME
    @GetMapping("/search")
    public List<Student> searchByName(@RequestParam String name) {
        return repo.findByName(name);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student newStudent) {

        Student oldStudent = repo.findById(id).orElseThrow();

        oldStudent.setName(newStudent.getName());
        oldStudent.setEmail(newStudent.getEmail());
        oldStudent.setAge(newStudent.getAge());
        oldStudent.setCourse(newStudent.getCourse());

        return repo.save(oldStudent);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        repo.deleteById(id);
    }
}