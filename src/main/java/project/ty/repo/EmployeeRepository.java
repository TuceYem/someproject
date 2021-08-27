package project.ty.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.ty.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
