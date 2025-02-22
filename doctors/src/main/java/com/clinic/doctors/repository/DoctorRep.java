package com.clinic.doctors.repository;

import com.clinic.doctors.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRep extends JpaRepository<Doctor,Long> {
}
