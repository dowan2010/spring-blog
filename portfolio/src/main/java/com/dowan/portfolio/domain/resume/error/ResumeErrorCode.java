package com.dowan.portfolio.domain.resume.error;

import com.dowan.portfolio.global.exception.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ResumeErrorCode implements ErrorCode {
    RESUME_NOT_FOUND(HttpStatus.NOT_FOUND, "등록된 이력서가 없습니다.");

    private final HttpStatus httpStatus;
    private final String message;
}
