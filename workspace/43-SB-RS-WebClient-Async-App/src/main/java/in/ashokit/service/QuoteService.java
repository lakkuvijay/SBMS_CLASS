package in.ashokit.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.response.QuoteApiResponse;

@Service
public class QuoteService {

	public String invokeQuoteApi() {
		String apiUrl = "https://quoters.apps.pcfone.io/api/random";

		WebClient webClient = WebClient.create();

		  webClient.get()
				   .uri(apiUrl)
				   .header("Accept", "application/json")
				   .retrieve()
				   .bodyToMono(QuoteApiResponse.class)
				   .subscribe(QuoteService::handleResponse);
		  
		  System.out.println("*******Request Sent*******");
		  
		  return "Success";
	}
	
	public static void handleResponse(QuoteApiResponse resData) {
		System.out.println(resData);
		System.out.println("Response pushed to Apache Kafka.......");
	}
}
