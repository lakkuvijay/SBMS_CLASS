package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.bindings.Flights;

@Service
public class FlightService {

	public String invokeUnitedFlightsApi() {

		String endpointUrl = "http://mu.mulesoft-training.com/essentials/united/flights/";

		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> responseEntity = rt.getForEntity(endpointUrl, String.class);

		String body = responseEntity.getBody();

		return body;

	}

	public Flights invokeFlightsApi() {

		String endpointUrl = "http://mu.mulesoft-training.com/essentials/united/flights/";

		RestTemplate rt = new RestTemplate();

		ResponseEntity<Flights> responseEntity = rt.getForEntity(endpointUrl, Flights.class);

		Flights body = responseEntity.getBody();

		return body;
	}

}
