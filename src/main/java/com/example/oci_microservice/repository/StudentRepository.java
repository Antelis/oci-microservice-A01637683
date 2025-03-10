package com.example.oci_microservice.repository;

import com.example.oci_microservice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}