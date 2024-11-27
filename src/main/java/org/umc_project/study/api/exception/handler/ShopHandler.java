package org.umc_project.study.api.exception.handler;

import org.umc_project.study.api.code.BaseErrorCode;

public class ShopHandler extends GeneralException {

    public ShopHandler(BaseErrorCode errorCode){
        super(errorCode);
    }
}
