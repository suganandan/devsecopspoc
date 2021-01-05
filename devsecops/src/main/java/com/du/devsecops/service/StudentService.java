package com.du.devsecops.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.du.devsecops.repositry.StudentRepository;
import com.du.devsecops.vo.Student;

@Service
public class StudentService implements IStudent {
    
    StudentRepository studentrepo;
    @Autowired
    public StudentService(StudentRepository studentrepo) {
        this.studentrepo = studentrepo;
    }
    @Override
    public List<Student> getAllStudents() {
        return studentrepo.findAll();
    }
    @Override
    public Optional<Student> findById(int id) {
        return studentrepo.findById(id);
    }
    @Override
    public Optional<Student> findByEmail(String email) {
        return studentrepo.findByEmail(email);
    }
    @Override
    public Student save(Student std) {
        return studentrepo.save(std);
    }
    @Override
    public void deleteById(int id) {
        studentrepo.deleteById(id);
    }
}