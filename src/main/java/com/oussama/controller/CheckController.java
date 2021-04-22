package com.oussama.controller;

import java.math.BigInteger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.oussama.registrationEligibility.StudentRequest;

@Controller
public class CheckController {

	@GetMapping("/check/student")
	public String checkStudentForm(Model model) {
		StudentRequest request= new StudentRequest();
		request.setNumberOfCertifications(new BigInteger("0"));
		model.addAttribute("request", request);
		return "request";
	}
}
