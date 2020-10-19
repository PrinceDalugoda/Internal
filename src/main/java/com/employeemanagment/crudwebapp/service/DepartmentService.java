package com.employeemanagment.crudwebapp.service;

import com.employeemanagment.crudwebapp.model.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> getAllDepartments();

    void saveDepartment(Department department);


}
