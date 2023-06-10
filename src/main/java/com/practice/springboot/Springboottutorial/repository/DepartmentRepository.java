package com.practice.springboot.Springboottutorial.repository;

import com.practice.springboot.Springboottutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentNameIgnoreCase(String departmentName);


}
