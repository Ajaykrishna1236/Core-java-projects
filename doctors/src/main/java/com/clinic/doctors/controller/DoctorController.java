package com.clinic.doctors.controller;

import com.clinic.doctors.Service.DoctorService;
import com.clinic.doctors.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService service;

    @PostMapping("/doc")
    public Doctor saveDoctor(@RequestBody Doctor doctor) {
        return service.saveDoctorDetails(doctor);
    }




    @GetMapping("/doctor/{id}")
    public Doctor getDoctorDetails(@PathVariable Long id) {

        return service.getDoctor(id);

    }

    @DeleteMapping("/doctorId/{id}")
    public void getDoc(@PathVariable Long id) {

        service.deleteDoctorDet(id);

    }

    @GetMapping("/getdoc")
    public  List<Doctor> getDetailDoc(){
        return  service.doctorDetail();
    }

    @PutMapping("/uppdoc")

    public  Doctor updateDoctorDetails(@RequestBody Doctor doctor){
        return service.updateDoctorde(doctor);
    }


}