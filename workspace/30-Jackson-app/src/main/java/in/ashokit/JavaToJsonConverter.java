package in.ashokit;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {

		Book book = new Book();
		book.setBookId(101);
		book.setBookName("Spring");
		book.setBookPrice(450.00);

		// convert book data into json
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(book);
		System.out.println(json);
	}

}
