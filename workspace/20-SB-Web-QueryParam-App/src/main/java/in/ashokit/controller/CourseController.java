package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CourseController {

	@GetMapping("/course")
	@ResponseBody
	public String getCourseDtls(String cname, String trainer) {

		if (cname.equals("SBMS")) {
			String msg = cname + " By " + trainer + " Starting From 23-Jun-21 @6:30 AM IST";
			return msg;
		} else if (cname.equals("JRTP")) {
			String msg = cname + " By " + trainer + " Starting From 30-Jun-21 @11:30 AM IST";
			return msg;
		}
		return "Contact Admin Team :: + 91-6301921083";
	}
}
