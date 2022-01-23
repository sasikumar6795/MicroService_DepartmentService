package com.sasi.departmentservice.service;

import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sasi.departmentservice.entity.Department;
import com.sasi.departmentservice.repository.DepartmentRepository;

@Service
public class DepartmentService {

    private static final Logger log = Logger.getLogger(DepartmentService.class);

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department department) {
        log.info("inside save Department service");
        return departmentRepository.save(department);
    }

    public Optional<Department> findByDepartmentId(Long departmentId) {
        log.info("inside findByDepartmentId service");
        return departmentRepository.findByDepartmentId(departmentId);
    }

}