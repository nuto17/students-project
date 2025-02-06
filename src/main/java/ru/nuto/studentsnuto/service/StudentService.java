package ru.nuto.studentsnuto.service;

import org.springframework.stereotype.Service;
import ru.nuto.studentsnuto.model.Student;

import java.util.List;

@Service
public interface StudentService {
    List<Student> findAllStudent();

    Student saveStudent(Student student);

    Student findByEmail(String mail);

    Student updateStudent(Student student);

    void deleteStudent(String email);
}
