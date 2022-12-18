package com.app.springbootsample.service;


import com.app.springbootsample.exception.StudentNotFoundException;
import com.app.springbootsample.model.entity.Student;
import com.app.springbootsample.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Student getStudent(Integer id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Student student, Integer id) {
       return studentRepository.findById(id)
               .map(savedStudent -> {
                   savedStudent.setFirst_name(student.getFirst_name());
                   savedStudent.setLast_name(student.getLast_name());
                   return studentRepository.save(savedStudent);
               })
               .orElseThrow(() -> new StudentNotFoundException(id));
    }
}
