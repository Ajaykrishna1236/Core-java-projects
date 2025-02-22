package com.clinic.doctors.Service;

import com.clinic.doctors.repository.DoctorRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clinic.doctors.entity.Doctor;

import javax.print.Doc;
import java.util.List;


@Service
public class DoctorService {
    @Autowired
    private DoctorRep doctorRep;

    public  Doctor saveDoctorDetails(Doctor doctor){
        return doctorRep.save(doctor);
    }

    public Doctor getDoctor(Long id){
        return doctorRep.findById(id).orElse(null);
    }

  public  void deleteDoctorDet(Long id){

         doctorRep.deleteById(id);
      
  }

  public Doctor updateDoctorde(Doctor doctor){

        Doctor updateDoc=doctorRep.findById(doctor.getId()).orElse(null);
        if(updateDoc!=null){
              updateDoc.setName(doctor.getName());
              updateDoc.setAge(doctor.getAge());
              doctorRep.save(updateDoc);
              return updateDoc;
        }
        return  null;
  }


  public List<Doctor> doctorDetail(){
        return doctorRep.findAll();
  }


}
