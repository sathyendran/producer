package org.sathya.employee;

import lombok.extern.log4j.Log4j2;
import org.sathya.exception.EmployeeNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee findByEmail(String email) throws EmployeeNotFound {
        log.info("Fetching the Employee detail for Email : {}",email);
        Optional<Employee> byEmail = employeeRepository.findByEmail(email);
        if (byEmail.isEmpty()) {
            throw  new EmployeeNotFound("Employee details not available");
        }
        return byEmail.get();
    }
}
