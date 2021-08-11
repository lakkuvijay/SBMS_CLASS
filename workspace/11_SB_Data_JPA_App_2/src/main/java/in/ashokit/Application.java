package in.ashokit;

import java.util.Arrays;
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

		List<Employee> findByEmpName = empRepository.findByEmpName("Ashok");
		System.out.println(findByEmpName);

		List<Employee> findByEmpSal = empRepository.findByEmpSal(15000.00);
		System.out.println(findByEmpSal);

		List<Employee> findByEmpNameAndEmpSal = empRepository.findByEmpNameAndEmpSal("Ram", 23000.00);
		System.out.println(findByEmpNameAndEmpSal);

		List<Employee> findByEmpSalGreaterThan = empRepository.findByEmpSalGreaterThan(15000.00);
		findByEmpSalGreaterThan.forEach(emp -> {
			System.out.println(emp);
		});

		System.out.println("======================================");

		List<Employee> findByEmpNameIn = empRepository.findByEmpNameIn(Arrays.asList("John", "Smith", "Ashok"));
		findByEmpNameIn.forEach(emp -> {
			System.out.println(emp);
		});

		System.out.println("======================================");

		Double salary = empRepository.findEmpSalByEmpName("Ashok");
		System.out.println("Salary :: " + salary);

	}
}
