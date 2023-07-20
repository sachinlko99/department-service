package com.example.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}