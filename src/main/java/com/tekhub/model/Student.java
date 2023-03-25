package com.tekhub.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

@Entity
public class Student {
    String stuentName;
    String rollNo;
    @Id
    int age;
    @Embedded
    GuardianInfo guardianInfo;
}
