package com.example.departmentservice.service;

import org.springframework.stereotype.Service;

import com.example.departmentservice.entity.Department;
@Service
public interface DepartmentService {
    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);
}