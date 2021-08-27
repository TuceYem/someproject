package project.ty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.ty.model.Employee;
import project.ty.service.EmployeeService;

import java.util.List;
import java.util.Optional;

@RestController
public class ProjectController {

    @Autowired
    EmployeeService projectService;

    @GetMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }

    @GetMapping("/Employee")
    public List<Employee> allEmployees(){
        return this.projectService.getAllEmployees();
    }

    @GetMapping("/Employee/{id}")
    public Optional<Employee> allEmployees(@PathVariable Long id){
        return this.projectService.getEmployeeById(id);
    }

    @PostMapping("/Employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return this.projectService.saveEmployee(employee);
    }

    @DeleteMapping("/Employee/{id}")
    public String employeeDeleted (@PathVariable("id") Long id){
        this.projectService.deleteEmployee(id);
        return id + " geloescht";
    }

    @PutMapping("/Employees")
    public void updateEmployee(@RequestBody Employee employee){
        this.projectService.updateEmployee(employee);
    }
}