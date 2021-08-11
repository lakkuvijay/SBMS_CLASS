package in.ashokit;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaConverter {

	public static void main(String[] args) throws Exception {
		File file = new File("Book.json");
		ObjectMapper mapper = new ObjectMapper();
		Book book = mapper.readValue(file, Book.class);
		System.out.println(book);
	}
}
