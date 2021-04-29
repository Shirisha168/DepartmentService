package com.example.department.DepartmentService.repository;

import com.example.department.DepartmentService.entity.Department;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRespository extends JpaRepository<Department, Long> {

    Department findByDepartmentId(Long departmentId);
}
