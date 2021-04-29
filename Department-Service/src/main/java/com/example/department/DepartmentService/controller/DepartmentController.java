package com.example.department.DepartmentService.controller;

import com.example.department.DepartmentService.entity.Department;
import com.example.department.DepartmentService.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.graalvm.compiler.phases.common.DeadCodeEliminationPhase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside savedepartmetn");
        return departmentService.saveDepartment(department);
    }

    @PostMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("inside findDepartmentById");
        return departmentService.findByDepartmentId(departmentId);
    }



}
