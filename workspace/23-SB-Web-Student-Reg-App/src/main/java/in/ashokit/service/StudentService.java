package in.ashokit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Courses;
import in.ashokit.entity.Genders;
import in.ashokit.entity.Timings;
import in.ashokit.repositories.CoursesRepository;
import in.ashokit.repositories.GendersRepository;
import in.ashokit.repositories.TimingsRepository;

@Service
public class StudentService {

	@Autowired
	private GendersRepository gendersRepo;

	@Autowired
	private CoursesRepository coursesRepo;

	@Autowired
	private TimingsRepository timingsRepo;

	public List<String> getGenders() {
		List<Genders> findAll = gendersRepo.findAll();

		List<String> genders = new ArrayList<>();

		findAll.forEach(gender -> {
			genders.add(gender.getGenderName());
		});

		return genders;
	}

	public List<String> getCourses() {
		List<Courses> findAll = coursesRepo.findAll();

		List<String> courses = new ArrayList<>();
		findAll.forEach(course -> {
			courses.add(course.getCourseName());
		});

		return courses;
	}

	public List<String> getTimings() {
		List<Timings> findAll = timingsRepo.findAll();

		List<String> timings = new ArrayList<>();
		findAll.forEach(timing -> {
			timings.add(timing.getTimingName());
		});

		return timings;
	}
}
