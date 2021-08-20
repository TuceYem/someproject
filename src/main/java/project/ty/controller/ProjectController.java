package project.ty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.ty.model.Employee;
import project.ty.service.EmployeeService;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    EmployeeService projectService;

    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "Hello World";
    }

    @GetMapping("/Employee")
    public List<Employee> allEmployees(){
        return this.projectService.getAllEmployees();
    }

    @PostMapping("/Employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return this.projectService.saveEmployee(employee);
    }

    @DeleteMapping("/Employee")
    public void employeeDeleted (@RequestParam("id") Long id){
        this.projectService.deleteEmployee(id);
    }
}