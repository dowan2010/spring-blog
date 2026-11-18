package com.dowan.portfolio.domain.resume.error.exception;

import com.dowan.portfolio.domain.resume.error.ResumeErrorCode;
import com.dowan.portfolio.global.exception.CustomException;

public class ResumeUrlNotFoundException extends CustomException {
    public ResumeUrlNotFoundException() {
        super(ResumeErrorCode.RESUME_NOT_FOUND);
    }
}
