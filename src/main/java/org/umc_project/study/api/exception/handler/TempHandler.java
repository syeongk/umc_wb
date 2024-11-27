package org.umc_project.study.api.exception.handler;

import org.umc_project.study.api.code.BaseErrorCode;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode){
        super(errorCode);
    }
}
