package project.ty.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import project.ty.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
