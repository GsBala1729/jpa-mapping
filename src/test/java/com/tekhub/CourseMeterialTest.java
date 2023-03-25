package com.tekhub;

import com.tekhub.model.Course;
import com.tekhub.model.CourseMeterial;
import com.tekhub.repo.CourseMeterialRepo;
import org.apache.tomcat.util.buf.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CourseMeterialTest {

    @Autowired
    CourseMeterialRepo courseMeterialRepo;


    @Test
    public void saveCourseMeterialTest() {
        Course course = new Course().builder().courseName("DSA").starRating(8L).build();
        CourseMeterial courseMeterial = new CourseMeterial().builder().courseUrl("www.datastructure.com").course(course).build();
        courseMeterialRepo.save(courseMeterial);
    }

//    @Test
//    public void showCourseMeterials(){
//        List<CourseMeterial> courseMeterialList = courseMeterialRepo.findAll();
//        System.out.println("CourseMeterial::"+courseMeterialList);
//
//    }
}