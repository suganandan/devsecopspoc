package com.du.devsecops.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.du.devsecops.vo.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
    // Query method
    Optional<Student> findByEmail(String email);
}