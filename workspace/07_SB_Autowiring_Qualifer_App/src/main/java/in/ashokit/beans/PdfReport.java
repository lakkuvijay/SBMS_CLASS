package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class PdfReport implements IReport {

	public PdfReport() {
		System.out.println("PdfReport :: Constructor");
	}

	@Override
	public void generate() {
		System.out.println("Pdf Report Generating...");
	}

}
