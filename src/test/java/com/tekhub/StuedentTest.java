package com.tekhub;

import com.tekhub.model.GuardianInfo;
import com.tekhub.model.Student;
import com.tekhub.services.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StuedentTest {

    @Autowired
    StudentService studentService;

    @Test
    public void insertStudentInfo(){
        GuardianInfo guardianInfo = new GuardianInfo().builder()
                .name("Govindasamy")
                .phone("8090808090")
                .address("Salem")
                .build();

        Student student = new Student()
                .builder()
                .stuentName("Balakrishnan")
                .rollNo("12345")
                .age(25)
                .guardianInfo(guardianInfo)
                .build();
        studentService.saveStudentInfo(student);

    }
}
