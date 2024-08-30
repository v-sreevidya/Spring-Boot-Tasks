package com.example.Task.Controller;

import com.example.Task.Entity.Employee;
import com.example.Task.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployeesByHireYearAndDepartment(@RequestParam Integer hireYear,@RequestParam String department) {
        return employeeService.getEmployeesByHireYearAndDepartment(hireYear,department);
    }
}