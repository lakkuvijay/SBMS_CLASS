package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import in.ashokit.entity.Employee;
import in.ashokit.repository.EmpRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmpRepository empRepository = context.getBean(EmpRepository.class);

		Employee emp = new Employee();
		//if emp_id selected
		emp.setEmpId(101);
		
		//if emp_name selected
		emp.setEmpName("Ashok");
		
		//if emp_salary selected
		emp.setEmpSal(14000.00);

		Example<Employee> empExmpl = Example.of(emp);

		List<Employee> findAll = empRepository.findAll(empExmpl);

		for (Employee e : findAll) {
			System.out.println(e);
		}
	}
}
