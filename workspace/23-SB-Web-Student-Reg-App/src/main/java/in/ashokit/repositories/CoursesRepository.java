package in.ashokit.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Serializable> {

}
