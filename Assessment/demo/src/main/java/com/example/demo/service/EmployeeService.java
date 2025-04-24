package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee updateEmployee(Long id, Employee employeeDetails) {
        return employeeRepository.findById(id)
                .map(employee -> {
                    // Update fields only if they are not null
                    if (employeeDetails.getName() != null) {
                        employee.setName(employeeDetails.getName());
                    }
                    if (employeeDetails.getEmail() != null) {
                        employee.setEmail(employeeDetails.getEmail());
                    }
                    if (employeeDetails.getDepartment() != null) {
                        employee.setDepartment(employeeDetails.getDepartment());
                    }
                    if (employeeDetails.getSalary() != null) {
                        employee.setSalary(employeeDetails.getSalary());
                    }
                    // Save the updated employee and return it
                    return employeeRepository.save(employee);
                })
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + id));
    }

    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }

    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }
}

