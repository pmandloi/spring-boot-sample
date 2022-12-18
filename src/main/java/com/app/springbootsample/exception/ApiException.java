package com.app.springbootsample.exception;

import lombok.Builder;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@Builder
public class ApiException {
    private String errorMessage;
    private Integer statusCode;
    private ZonedDateTime zonedDateTime;
}
