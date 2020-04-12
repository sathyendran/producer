package org.sathya.exception;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExceptionMessage {
    private LocalDateTime timestamp;
    private String message;
}
