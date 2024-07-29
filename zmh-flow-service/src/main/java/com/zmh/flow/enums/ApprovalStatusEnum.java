package com.zmh.flow.enums;

import com.zmh.flow.statemachine.HandleStatusEnums;
import com.zmh.flow.statemachine.StatusHandleEnum;

/**
 * @Description: ApprovalStatusEnum
 * @author: zhou ming hao
 * @date: 2024年07月29日 21:44
 */

public enum ApprovalStatusEnum implements StatusHandleEnum<ApprovalStatusEnum> {
    ORGANIZATION_APPLY("01", "机构申请"){
        @Override
        public ApprovalStatusEnum getNextStatus(HandleStatusEnums handleStatusEnums) {
            return null;
        }
    };

    ApprovalStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;

    private String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
