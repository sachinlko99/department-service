package com.example.departmentservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.repository.DepartmentRepository;
import com.example.departmentservice.service.DepartmentService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {
	
    /*@Autowired
    private DepartmentRepository departmentRepository;*/

    @Override
    public Department saveDepartment(Department department) {
        return null;//departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return null;/////departmentRepository.findById(departmentId).get();
    }
}