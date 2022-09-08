package com.ledenov.spring.springboot.spring_data_jpa.controller;

import com.ledenov.spring.springboot.spring_data_jpa.entity.Employee;
import com.ledenov.spring.springboot.spring_data_jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees") //getmapping because of get-request
    public List<Employee> showAllEmployees() {

        List<Employee> allEmployees = employeeService.getAllEmployees();
        return  allEmployees;
    }

    @GetMapping("/employees/{id}") //getmapping because of get-request
    public Employee getEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
        return employee;
    }

    @PostMapping("/employees") //postmapping because of post-request
    public Employee addNewEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);

        return employee;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);
        employeeService.deleteEmployee(id);
        return "Employee with id = " + id + " was deleted!";
    }

    @GetMapping("/employees/name/{name}")
    public List <Employee> showAllEmployeesByName(@PathVariable String name) {
        List <Employee> employees = employeeService.findAllByName(name);
        return employees;
    }
}
