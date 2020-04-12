package org.sathya.employee;

import org.sathya.exception.EmployeeNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/email")
    public Employee findByEmail(@RequestBody Employee employee) throws EmployeeNotFound {
        return employeeService.findByEmail(employee.getEmail());
    }
}
