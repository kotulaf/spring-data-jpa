package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "student")
@Table(name = "student", uniqueConstraints = {@UniqueConstraint(name = "student_email_unique", columnNames = "email")})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @SequenceGenerator(name="sequence_student", sequenceName="sequence_student", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_student")

    @Column(name="id", updatable = false)
    private Long id;

    @Column(name="first_name", nullable = false, columnDefinition = "TEXT") // name is text NOT null, therefore we say nullable = false
    private String firstName;

    @Column(name="last_name", nullable = false, columnDefinition = "TEXT")
    private String lastName;

    @Column(name="email", nullable = false, columnDefinition = "TEXT")
    private String email;

    @Column(name="age")
    private Integer age;   

    public Student(String firstName, String lastName, String email, Integer age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
}
