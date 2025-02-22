package com.clinic.doctors.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="doctor_db")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Id
    @GeneratedValue


    @Column(name="ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    @Column(name="AGE")
    private int age;
}
