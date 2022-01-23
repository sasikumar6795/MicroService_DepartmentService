package com.sasi.departmentservice.controller;

import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasi.departmentservice.entity.Department;
import com.sasi.departmentservice.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private static final Logger log = Logger.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department)
    {
        log.info("inside save department controller");
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Optional<Department> findByDepartmentId(@PathVariable("id") Long departmentId)
    {
        log.info("inside findByDepartmentId controller");
        return departmentService.findByDepartmentId(departmentId);
    }

}