package com.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.patient.entity.Patient;
import com.patient.service.PatientService;


@Controller
public class PatientController {
	
	@Autowired
	PatientService patientService;
	
	@GetMapping("/patients")
	@ResponseBody
	public List<Patient> getPatients() {
		return patientService.getAllPatients();
	}
	
	private List<Patient> getPatientsList() {
//		Patient milena = new Patient("Milena", "Stamenova","Roza 15", "Veliko Turnovo", "4363");
//		Patient filip = new Patient("Filip", "Apostolov","Karamfil 6", "Pleven", "2258");
//		Patient grigor = new Patient("Grigor", "Stavrev","Gluharche 9", "Gabrovo", "2012");
//		return Arrays.asList(milena,filip,grigor);
		return null;
	}
}
