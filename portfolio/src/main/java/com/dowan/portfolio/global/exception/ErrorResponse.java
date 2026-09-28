package com.dowan.portfolio.global.exception;

import lombok.Builder;
import org.jspecify.annotations.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import java.util.List;
import java.util.stream.Collectors;

@Builder
public record ErrorResponse(
        HttpStatus status,

        boolean success,

        String data,

        String message
) {

    public static ErrorResponse from(@NonNull CustomException e) {
        return ErrorResponse.builder()
                .status(e.getStatus())
                .success(false)
                .data(null)
                .message(e.getMessage())
                .build();
    }

    public static ErrorResponse of(HttpStatus status, String data, String message) {
        return ErrorResponse.builder()
                .status(status)
                .success(false)
                .data(data)
                .message(message)
                .build();
    }

    public static ErrorResponse ofValidation(HttpStatus status, @NonNull List<FieldError> fieldErrors, String message) {
        return ErrorResponse.builder()
                .status(status)
                .success(false)
                .data(fieldErrors.stream()
                        .map(fe -> (fe.getField() + fe.getDefaultMessage()))
                        .collect(Collectors.joining(", ")))
                .message("입력값이 올바르지 않습니다.")
                .build();
    }

    public record FieldErrorDetail(String field, String message) {
    }
}
