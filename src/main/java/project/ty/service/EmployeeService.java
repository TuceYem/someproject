package project.ty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.ty.model.Employee;
import project.ty.repo.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployeeById(Long id){return this.employeeRepository.findById(id);};

    public List<Employee> getAllEmployees(){
        return this.employeeRepository.findAll();
    }

    public Employee saveEmployee(Employee employee){
        return this.employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id){
        this.employeeRepository.deleteById(id);
    }

    public Employee updateEmployee(Employee employee){
        Employee updatableEmployee = this.employeeRepository.findById(employee.getId()).orElse(null);
        updatableEmployee.setFirstname(employee.getFirstname());
        updatableEmployee.setLastname(employee.getLastname());
        updatableEmployee.setAge(employee.getAge());
        updatableEmployee.setOrg(employee.getOrg());
        return updatableEmployee;
    }
}
