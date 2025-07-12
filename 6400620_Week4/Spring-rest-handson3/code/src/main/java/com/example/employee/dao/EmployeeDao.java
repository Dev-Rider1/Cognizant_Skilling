package com.example.employee.dao;

import com.example.employee.model.Department;
import com.example.employee.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDao {
    private static final List<Employee> EMPLOYEE_LIST = new ArrayList<>();

    static {
        Department it = new Department(1, "IT");
        Department hr = new Department(2, "HR");

        List<String> skills = List.of("Java", "Spring", "Angular");

        EMPLOYEE_LIST.add(new Employee(100, "John Doe", it, skills));
        EMPLOYEE_LIST.add(new Employee(101, "Jane Smith", hr, skills));
        EMPLOYEE_LIST.add(new Employee(102, "Alice Johnson", it, skills));
        EMPLOYEE_LIST.add(new Employee(103, "Bob Brown", hr, skills));
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}
