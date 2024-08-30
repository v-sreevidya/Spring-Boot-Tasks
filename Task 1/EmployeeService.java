package com.example.Task.Service;

import com.example.Task.Entity.Employee;
import com.example.Task.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    //function for posting or saving data
//    public Employee saveDetails(Employee employee){
//        return employeeRepo.save(employee);
        public List<Employee> getEmployeesByHireYearAndDepartment(Integer hireYear,String department) {
            return employeeRepo.findByHireYearAndDepartment(hireYear,department);
        }


    }

