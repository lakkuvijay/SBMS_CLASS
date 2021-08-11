package in.ashokit.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.props.AppProperties;
import in.ashokit.response.QuoteApiResponse;

@Service
public class QuoteClient {

	@Autowired
	private AppProperties appProps;

	public String invokeRandomQuoteApi() {

		Map<String, String> messages = appProps.getMessages();
		String apiUrl = messages.get("quoteApiUrl");

		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> responseEntity = rt.getForEntity(apiUrl, String.class);

		int statusCode = responseEntity.getStatusCodeValue();

		if (statusCode == 200) {
			String body = responseEntity.getBody();
			return body;
		}
		return null;
	}

	public String invokeQuoteApi() {

		Map<String, String> messages = appProps.getMessages();
		String apiUrl = messages.get("quoteApiUrl");

		RestTemplate rt = new RestTemplate();

		ResponseEntity<QuoteApiResponse> responseEntity = rt.getForEntity(apiUrl, QuoteApiResponse.class);

		int statusCode = responseEntity.getStatusCodeValue();

		if (statusCode == 200) {
			QuoteApiResponse body = responseEntity.getBody();
			return body.getValue().getQuote().toUpperCase();
		}
		return null;
	}
}
