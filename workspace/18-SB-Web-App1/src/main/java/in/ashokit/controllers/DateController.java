package in.ashokit.controllers;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/report")
public class DateController {

	@GetMapping("/date")
	public ModelAndView getTodaysDate() {
		ModelAndView mav = new ModelAndView();

		// java.util.Date class will give both date and time together
		// Date d = new Date();

		// LocalDate class will give only Date
		LocalDate ld = LocalDate.now();

		mav.addObject("msg", "Today's date :: " + ld);
		mav.setViewName("index");

		return mav;
	}

}
