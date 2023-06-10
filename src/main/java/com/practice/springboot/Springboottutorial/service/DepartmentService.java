package com.practice.springboot.Springboottutorial.service;

import com.practice.springboot.Springboottutorial.entity.Department;
import com.practice.springboot.Springboottutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchAllDepartments();

    Department getDepartment(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartment(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department getDepartmentByName(String departmentName);
}
