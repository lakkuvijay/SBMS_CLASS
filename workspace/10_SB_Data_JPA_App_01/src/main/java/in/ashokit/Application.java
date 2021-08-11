package in.ashokit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.repository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmpRepository empRepository = context.getBean(EmpRepository.class);

		/*Employee emp = new Employee();
		emp.setEmpId(103);
		emp.setEmpName("John");
		emp.setEmpSal(18000.00);
		empRepository.save(emp);
		System.out.println("+++++++++++++++Record Saved++++++++++++++++++++");*/
		
		
		/*Employee e1 = new Employee(104, "Ram", 23000.00);
		Employee e2 = new Employee(105, "Rani", 24000.00);
		Employee e3 = new Employee(106, "Gita", 34000.000);
		
		List<Employee> emps = new ArrayList<>();
		emps.add(e1); emps.add(e2); emps.add(e3);
		
		empRepository.saveAll(emps);*/
		
		/*Optional<Employee> findById = empRepository.findById(140);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}else {
			System.out.println("Record Not Available....");
		}*/
		
		/*List<Serializable> empIds = new ArrayList<>();
		empIds.add(101);
		empIds.add(102);
		empIds.add(103);
		empIds.add(240);
		
		Iterable<Employee> emps = empRepository.findAllById(empIds);
		emps.forEach(emp -> {
			System.out.println(emp);
		});*/
		
		/*Iterable<Employee> findAll = empRepository.findAll();
		findAll.forEach(emp -> System.out.println(emp));*/
		
		/*long count = empRepository.count();
		System.out.println("Total Records Available :: "+count);*/
		
		/*boolean isAvailable = empRepository.existsById(104);
		System.out.println("Emp Available :: " + isAvailable);*/
		
		empRepository.deleteById(200);
		
	}
}
