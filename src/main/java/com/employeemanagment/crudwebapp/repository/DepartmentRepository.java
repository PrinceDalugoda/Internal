package com.employeemanagment.crudwebapp.repository;

import com.employeemanagment.crudwebapp.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}