package com.oussama.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.oussama.registrationEligibility.StudentRequest;
import com.oussama.registrationEligibility.WsResponse;
// the main role of SoapClient class is the invokation of our service 
@Service
public class SoapClient {

	private WebServiceTemplate serviceTemplate;
	@Autowired
	private Jaxb2Marshaller marshaller;
	
	public WsResponse getStudentStatus(StudentRequest request) {
		serviceTemplate = new WebServiceTemplate(marshaller);
		// invoke the service
		WsResponse response = (WsResponse) serviceTemplate.marshalSendAndReceive("http://localhost:9090/ws",request);
		return response;
	}
}
