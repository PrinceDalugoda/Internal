package com.employeemanagment.crudwebapp.service;

import com.employeemanagment.crudwebapp.model.Department;
import com.employeemanagment.crudwebapp.model.Employee;
import com.employeemanagment.crudwebapp.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public void saveDepartment(Department department) {
        this.departmentRepository.save(department);
    }




}

