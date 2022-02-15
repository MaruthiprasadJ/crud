package com.example.curd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curd.dto.EmployeeDTO;
import com.example.curd.modal.Employee;
import com.example.curd.repository.EmployeeRepository;
import com.example.curd.service.EmployeeService;
import com.example.curd.utils.EmployeeUtils;

@Service
public class EmplyeeServiceImpl extends EmployeeUtils implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
			Employee save = employeeRepository.save(convertEmployeeDTOToDO(employeeDTO));
			return convertEmployeeDOToDTO(save);
	}

	@Override
	public EmployeeDTO getEmployee(EmployeeDTO employeeDTO) {
		return null;
	}

	@Override
	public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
		return null;
	}

	@Override
	public EmployeeDTO deleteEmployee(EmployeeDTO employeeDTO) {
		return null;
	}

	@Override
	public EmployeeDTO getEmployeeById(Long id) {
		return convertEmployeeDOToDTO(employeeRepository.findById(id).get());
	}

}
