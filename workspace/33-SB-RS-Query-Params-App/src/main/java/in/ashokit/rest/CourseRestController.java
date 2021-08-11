package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {

	@GetMapping(value = "/course")
	public String getCourseDetails(@RequestParam(value = "name", defaultValue = "SBMS") String name) {
		String msg = "";
		if ("SBMS".equals(name)) {
			msg = "New Batch for SBMS From 15-Jul-2021 @8:00 PM IST";
		} else if ("JRTP".equals(name)) {
			msg = "New Batch For JRTP From 14-Jul-2021 @11:30 AM IST";
		} else if ("AWS".equals(name)) {
			msg = "New Batch For AWS From 13-Jul-2021 @7:00 PM IST";
		} else {
			msg = "Please visit www.ashokit.in for more details";
		}
		return msg;
	}

	@GetMapping(value = "/fee")
	public String getCourseFee(@RequestParam("cname") String cname, @RequestParam("tname") String tname) {
		String msg = cname + " By " + tname + " is 5000 INR Only";
		return msg;
	}

}
