package com.example.jobportal.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "candidate")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;
    private String password;
    private String phone;
    private String skills;
    private String education;
    private String resume;
}