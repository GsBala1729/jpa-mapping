package com.tekhub.services;

import com.tekhub.model.Student;
import com.tekhub.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;

    public void saveStudentInfo(Student student){
        studentRepo.save(student);
    }
}
