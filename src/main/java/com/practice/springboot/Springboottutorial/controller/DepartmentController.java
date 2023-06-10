package com.practice.springboot.Springboottutorial.controller;

import com.practice.springboot.Springboottutorial.entity.Department;
import com.practice.springboot.Springboottutorial.error.DepartmentNotFoundException;
import com.practice.springboot.Springboottutorial.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Inside saveDepartment API");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/getAllDepartments")
    public List<Department> fetchAllDepartments() {
        LOGGER.info("Inside fetchAllDepartments API");
        return departmentService.fetchAllDepartments();
    }

    @GetMapping("/getDepartment/{id}")
    public Department getSpecificDepartment(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.getDepartment(departmentId);
    }

    @DeleteMapping("/getDepartment/{id}")
    public String deleteSpecificDepartment(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartment(departmentId);
        return "Department Deleted Successfully";
    }

    @PutMapping("/updateDepartment/{id}")
    public Department updateSpecificDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId, department);
    }

    @GetMapping("/getDepartment/name/{name}")
    public Department getSpecificDepartmentByName(@PathVariable("name") String departmentName) {
        return departmentService.getDepartmentByName(departmentName);
    }
}
