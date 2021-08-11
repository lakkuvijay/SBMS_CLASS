package in.ashokit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.utils.DateUtils;

@Service
public class ReportService {

	@Autowired
	private DateUtils du;

	public ReportService() {
		System.out.println("ReportService :: Constructor");
	}

	public void generateReport() {
		LocalDate date = du.getDate();
		System.out.println("Report Generated For :: " + date);
	}
}
