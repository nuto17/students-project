package ru.nuto.studentsnuto.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nuto.studentsnuto.model.Student;
import ru.nuto.studentsnuto.repository.InMemoryStudentDAO;
import ru.nuto.studentsnuto.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String mail) {
        return repository.findByEmail(mail);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
