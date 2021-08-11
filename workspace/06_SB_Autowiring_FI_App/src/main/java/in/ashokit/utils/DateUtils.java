package in.ashokit.utils;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class DateUtils {

	public DateUtils() {
		System.out.println("DateUtils::Constructor");
	}

	public LocalDate getDate() {
		LocalDate now = LocalDate.now();
		return now;
	}
}
