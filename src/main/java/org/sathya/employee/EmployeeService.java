package org.sathya.employee;

import org.sathya.exception.EmployeeNotFound;

public interface EmployeeService {
    Employee findByEmail(String email) throws EmployeeNotFound;
}
