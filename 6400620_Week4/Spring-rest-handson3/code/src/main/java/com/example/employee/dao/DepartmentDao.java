package com.example.employee.dao;

import com.example.employee.model.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDao {
    private static final List<Department> DEPARTMENT_LIST = List.of(
        new Department(1, "IT"),
        new Department(2, "HR")
    );

    public List<Department> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}
