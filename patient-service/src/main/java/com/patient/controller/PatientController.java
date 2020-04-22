package com.patient.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.patient.entity.Patient;


@Controller
public class PatientController {
	@GetMapping("/patients")
	@ResponseBody
	public List<Patient> getPatients() {
		return getPatientsList();
	}
	
	private List<Patient> getPatientsList() {
		Patient milena = new Patient("Milena", "Stamenova","Roza 15", "Veliko Turnovo", "4363");
		Patient filip = new Patient("Filip", "Apostolov","Karamfil 6", "Pleven", "2258");
		Patient grigor = new Patient("Grigor", "Stavrev","Gluharche 9", "Gabrovo", "2012");
		return Arrays.asList(milena,filip,grigor);
	}
}
