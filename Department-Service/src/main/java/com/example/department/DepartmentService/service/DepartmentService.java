package com.example.department.DepartmentService.service;

import com.example.department.DepartmentService.entity.Department;
import com.example.department.DepartmentService.repository.DepartmentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentService {

    @Autowired
    private DepartmentRespository departmentRespository;


    public Department saveDepartment(Department department) {
        return departmentRespository.save(department);
    }

    public Department findByDepartmentId(Long departmentId){
        return departmentRespository.findByDepartmentId(departmentId);
    }
}
