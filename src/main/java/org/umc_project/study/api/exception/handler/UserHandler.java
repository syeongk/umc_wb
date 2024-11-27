package org.umc_project.study.api.exception.handler;

import org.umc_project.study.api.code.BaseErrorCode;

public class UserHandler extends GeneralException {
    public UserHandler(BaseErrorCode errorCode){
        super(errorCode);
    }

}
