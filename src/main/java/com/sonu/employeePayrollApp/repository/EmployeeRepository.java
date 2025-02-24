package com.sonu.employeePayrollApp.repository;

import com.sonu.employeePayrollApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
