package com.jbk.EduTrack.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.EduTrack.entity.Student;
import com.jbk.EduTrack.repository.StudentRepository;
import com.jbk.EduTrack.service.StudentService;

@Service
public class ServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getById(int id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		studentRepository.deleteById(id);
	}

}
