package in.ashokit.bindings;

import java.util.Arrays;

public class Student {

	private String name;
	private String email;
	private Long phno;
	private String gender;
	private String course;
	private String[] timings;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String[] getTimings() {
		return timings;
	}

	public void setTimings(String[] timings) {
		this.timings = timings;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", phno=" + phno + ", gender=" + gender + ", course="
				+ course + ", timings=" + Arrays.toString(timings) + "]";
	}

}
