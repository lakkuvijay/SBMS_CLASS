package in.ashokit.rest;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.request.PassengerRequest;
import in.ashokit.response.TicketResponse;

@RestController
public class IrctcRestController {

	@PostMapping(
			value = "/bookticket",
			consumes = {
					"application/xml",
					"application/json"
			},
			produces = { 
					"application/xml",
					"application/json"
			}
	)
	public ResponseEntity<TicketResponse> bookTicket(@RequestBody PassengerRequest request) {

		// logic to book ticket

		TicketResponse response = new TicketResponse();
		response.setStatus("CONFIRMED");
		response.setPrice(1500.09);
		
		BeanUtils.copyProperties(request, response);
		
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
}
