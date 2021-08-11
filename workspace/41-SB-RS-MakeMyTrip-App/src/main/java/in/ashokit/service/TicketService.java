package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.request.PassengerRequest;
import in.ashokit.response.TicketResponse;

@Service
public class TicketService {

	@Autowired
	private RestTemplate rt;

	public TicketResponse initiateTicketBookProcess(PassengerRequest requestData) {

		String endpointUrl = "http://localhost:9090/bookticket";
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", "application/json");
		headers.set("Accept", "application/json");
		
		HttpEntity<PassengerRequest> request =  new HttpEntity<>(requestData, headers);

		/*ResponseEntity<TicketResponse> postForEntity = 
					rt.postForEntity(endpointUrl, request, TicketResponse.class);*/
		
		ResponseEntity<TicketResponse> postForEntity = 
				rt.exchange(endpointUrl, HttpMethod.POST, request, TicketResponse.class);
		
		TicketResponse body = postForEntity.getBody();

		return body;
	}

}
