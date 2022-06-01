package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "Student")
@Table
@Getter
@Setter
@AllArgsConstructor
public class Student {
    @Id
    @SequenceGenerator(name="sequence_student", sequenceName="sequence_student", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_student")
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;   
}
