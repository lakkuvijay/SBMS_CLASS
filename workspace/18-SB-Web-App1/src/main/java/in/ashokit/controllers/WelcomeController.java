package in.ashokit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class WelcomeController {

	@GetMapping("/welcome")
	public ModelAndView displayWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Welcome to Ashok IT...!!!");
		mav.setViewName("index");
		return mav;
	}

	@GetMapping("/greet")
	public ModelAndView displayGreetMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("greetMsg", "Good Mrng....!!");
		mav.setViewName("index");
		return mav;
	}
}
