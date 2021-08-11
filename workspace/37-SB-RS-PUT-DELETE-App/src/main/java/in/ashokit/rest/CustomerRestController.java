package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Customer;

@RestController
public class CustomerRestController {

	@PutMapping(value = "/update", consumes = { "application/json" })
	public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
		// logic to update customer record in DB
		System.out.println(customer);
		return new ResponseEntity<>("Updated Successfully", HttpStatus.OK);
	}

	@DeleteMapping(value = "/delete/{customerId}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer customerId) {
		// logic to delete customer record using customerId
		System.out.println(customerId);
		return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
	}

}