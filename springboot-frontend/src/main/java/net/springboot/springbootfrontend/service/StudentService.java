package net.springboot.springbootfrontend.service;

import java.util.List;

import net.springboot.springbootfrontend.entity.Student;

public interface StudentService

{
	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentById(Long id);

	Student updateStudent(Student student);

	void deleteStudentById(Long id);
}