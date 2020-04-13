package org.sathya;

import org.sathya.employee.Employee;
import org.sathya.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class Application implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Employee> employees = Arrays.asList(
                new Employee("Sathya", "A", "sathya.a@xyz.com"),
                new Employee("Raja", "A", "raja.a@xyz.com"),
                new Employee("Satish", "S", "sathish.a@xyz.com")
        );
        employeeRepository.saveAll(employees);
    }
}
