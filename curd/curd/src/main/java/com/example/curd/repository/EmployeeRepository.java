package com.example.curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.curd.modal.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
