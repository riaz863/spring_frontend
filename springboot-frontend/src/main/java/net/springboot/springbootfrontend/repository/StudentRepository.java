package net.springboot.springbootfrontend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.springboot.springbootfrontend.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}