package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.Employee;

public interface EmpRepository extends CrudRepository<Employee, Serializable> {

}
