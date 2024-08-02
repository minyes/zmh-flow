package com.zmh.flow.app.result;

/**
 * @Description: ResultCode
 * @author: zhou ming hao
 * @date: 2024年07月28日 17:20
 *
 * 响应码规范
 * （1）1到2位是系统码字母缩写标识  流程系统  LW
 * （2）第3位是 区分 系统异常和业务异常  1是系统异常 2是业务异常
 * （3）第4到第6位 根据定义递增
 *
 */

public enum ResultCode {

    SUCCESS("LW1000", "成功"),
    PARAM_IS_INVALID("LW1001", "参数无效"),
    PARAM_IS_BLANK("LW1002", "参数为空"),
    PARAM_TYPE_BIND_ERROR("LW1003", "参数类型错误"),
    SYSTEM_ERROR("LW1999","流程系统出现异常");

    private String code;
    private String message;

    private ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String code() {
        return this.code;
    }
    public String message() {
        return this.message;
    }
}
