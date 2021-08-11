package in.ashokit.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.request.PassengerRequest;
import in.ashokit.response.TicketResponse;

@Service
public class TicketService {

	public TicketResponse initiateTicketBookProcess(PassengerRequest requestData) {

		String endpointUrl = "http://localhost:9090/bookticket";
		
		WebClient webClient = WebClient.create();
		
		TicketResponse ticket = webClient.post()
										 .uri(endpointUrl)
										 .contentType(MediaType.APPLICATION_JSON)
										 .accept(MediaType.APPLICATION_JSON)
										 .body(requestData, PassengerRequest.class)
										 .retrieve()
										 .bodyToMono(TicketResponse.class)
										 .block();

		return ticket;
	}
}
