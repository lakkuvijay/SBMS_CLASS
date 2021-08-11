package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest1")
public class GreetRestController {

	@GetMapping
	public String getGreetMsg() { // http://localhost:9090/rest1/
		String msg = "Good Morning...!!";
		return msg;
	}

	@GetMapping("/wish") // http://localhost:9090/rest1/wish
	public String getWishMsg() {
		String msg = "All the best..!!";
		return msg;
	}

	@GetMapping("/quote") // http://localhost:9090/rest1/quote
	public String getQuote() {
		String msg = "Do or Die";
		return msg;
	}

}
