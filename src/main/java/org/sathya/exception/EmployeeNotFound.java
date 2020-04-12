package org.sathya.exception;

public class EmployeeNotFound extends NotFoundException {
    public EmployeeNotFound(String message) {
        super(message);
    }
}
