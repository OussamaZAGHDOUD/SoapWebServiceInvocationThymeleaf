package com.oussama.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.oussama.client.SoapClient;
import com.oussama.registrationEligibility.StudentRequest;
import com.oussama.registrationEligibility.WsResponse;

@Controller
public class CheckController {
	@Autowired
	private SoapClient client;
	
	@GetMapping("/check/student")
	public String checkStudentForm(Model model) {
		StudentRequest request= new StudentRequest();
		request.setNumberOfCertifications(new BigInteger("0"));
		model.addAttribute("request", request);
		return "request";
	}
	@PostMapping("/check/student")
	public String checkStudentWS(@ModelAttribute("request") StudentRequest request, Model model) {
		
		WsResponse response = client.getStudentStatus(request);
		model.addAttribute("response", response);
		
		return "response";
	}
}
