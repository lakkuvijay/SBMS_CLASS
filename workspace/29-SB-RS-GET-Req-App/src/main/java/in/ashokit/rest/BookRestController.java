package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.response.Book;

@RestController
public class BookRestController {

	@GetMapping("/book")
	public Book getBookData() {
		Book b = new Book(101, "Spring", 450.00);
		return b;
	}
}
