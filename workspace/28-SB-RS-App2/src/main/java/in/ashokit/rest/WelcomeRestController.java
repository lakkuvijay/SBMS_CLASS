package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest2")
public class WelcomeRestController {

	/*@GetMapping("/welcome")
	public String getWelcomeMsg() { // http://localhost:9090/rest2/welcome
		String msg = "Welcome To Vijay Reddy..!!";
		return msg;
	}*/

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		String msg = "Welcome To Vijay Reddy ..!!";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
}
