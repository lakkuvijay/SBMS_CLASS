package in.ashokit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaToXmlConverter {

	public static void main(String[] args) throws Exception {

		Book b = new Book();
		b.setBookId(201);
		b.setBookName("Hibernate");
		b.setBookPrice(500.00);

		JAXBContext context = JAXBContext.newInstance(Book.class);

		Marshaller marshaller = context.createMarshaller();

		marshaller.marshal(b, System.out);
	}

}
