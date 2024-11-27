package org.umc_project.study.api.exception.handler;

import org.umc_project.study.api.code.BaseErrorCode;

public class MissionHandler extends GeneralException {
    public MissionHandler(BaseErrorCode errorCode){
        super(errorCode);
    }

}
