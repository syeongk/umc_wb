package org.umc_project.study.api.exception.handler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.umc_project.study.api.code.BaseErrorCode;
import org.umc_project.study.api.code.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {

    private BaseErrorCode code;

    public ErrorReasonDTO getErrorReason(){
        return this.code.getReason();
    }

    public ErrorReasonDTO getErrorReasonHttpStatus(){
        return this.code.getReasonHttpStatus();
    }
}
