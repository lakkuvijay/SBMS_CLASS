package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repository.EmpRepository;

@Service
public class EmployeeService {

	private EmpRepository empRepo;

	@Autowired
	public EmployeeService(EmpRepository empRepo) {
		this.empRepo = empRepo;
	}

	public void saveData() {
		Employee emp = new Employee();
		emp.setEmpId(203);
		emp.setEmpName("Chaitu");
		emp.setEmpSal(25000.00);
		empRepo.save(emp);
	}
}
