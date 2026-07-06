package com.example.jobportal.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "job")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String company;
    private String location;
    private Double salary;

    @Column(length = 1000)
    private String description;

    private LocalDate lastDate;
}