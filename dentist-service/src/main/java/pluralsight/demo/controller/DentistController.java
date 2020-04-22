package pluralsight.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pluralsight.demo.entity.Dentist;

@Controller
public class DentistController {

	@GetMapping("/dentists")
	@ResponseBody
	public List<Dentist> getDentists() {
		return getDentistList();
	}
	
	private List<Dentist> getDentistList() {
		Dentist ivan = new Dentist("Ivan", "Stoimenov","Temenuga 23", "Lovech", "3241");
		Dentist plamena = new Dentist("Plamena", "Hristova","Nezabravka 11", "Sofia", "1632");
		Dentist stamat = new Dentist("Stamat", "Georgiev","Liliya 111", "Plovdiv", "5421");
		return Arrays.asList(ivan,plamena,stamat);
	}
}
