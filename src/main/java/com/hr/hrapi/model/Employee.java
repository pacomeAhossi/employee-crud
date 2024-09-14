package com.hr.hrapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "employees")
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String mail;

    private String password;
}
