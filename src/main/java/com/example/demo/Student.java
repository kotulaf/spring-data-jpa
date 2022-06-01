package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
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
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;   
}
