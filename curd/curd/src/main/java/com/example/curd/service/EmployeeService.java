package com.example.curd.service;

import com.example.curd.dto.EmployeeDTO;

public interface EmployeeService {

	public EmployeeDTO addEmployee(EmployeeDTO employeeDTO);

	public EmployeeDTO getEmployee(EmployeeDTO employeeDTO);

	public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);

	public EmployeeDTO deleteEmployee(EmployeeDTO employeeDTO);

	public EmployeeDTO getEmployeeById(Long id);

}
