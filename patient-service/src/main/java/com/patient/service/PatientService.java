package com.patient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patient.entity.Patient;
import com.patient.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	public Patient getPatientById(Long patientId) {
		return Optional.ofNullable(patientRepository.findById(patientId))
				.map(patientOptional -> patientOptional.get())
				.orElse(null);
	}
	
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}
	
	public Patient addPatient(Patient patientEntity) {
		return patientRepository.save(patientEntity);
	}
	
	public Patient editPatient(Patient patientEntity) {
		return patientRepository.save(patientEntity);
	}

}
