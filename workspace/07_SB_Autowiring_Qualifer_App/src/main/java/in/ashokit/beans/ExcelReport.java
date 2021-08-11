package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ExcelReport implements IReport {

	public ExcelReport() {
		System.out.println("Excel Report :: Constructor");
	}

	@Override
	public void generate() {
		System.out.println("Excel Report Generating...");
	}
}
