package com.patient.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.patient.entity.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient,Long>{
	
	List<Patient> findAll();

}
