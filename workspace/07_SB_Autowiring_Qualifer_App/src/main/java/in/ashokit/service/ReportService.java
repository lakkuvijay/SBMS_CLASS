package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.beans.IReport;

@Service
public class ReportService {

	private IReport report;

	public ReportService(IReport report) {
		System.out.println("ReportService::Constructor");
		this.report = report;
	}

	public void generateReport() {
		report.generate();
		System.out.println("Report Generation Completed....");
	}
}
