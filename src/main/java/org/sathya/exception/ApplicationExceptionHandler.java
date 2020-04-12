package org.sathya.exception;


import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@ControllerAdvice
@Log4j2
public class ApplicationExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ExceptionMessage> notFound(NotFoundException notFoundException) {
        ExceptionMessage exceptionMessage = new ExceptionMessage();
        exceptionMessage.setMessage(notFoundException.getMessage());
        exceptionMessage.setTimestamp(LocalDateTime.now());
        log.error(notFoundException);
        return new ResponseEntity<>(exceptionMessage, HttpStatus.NOT_FOUND);
    }
}
