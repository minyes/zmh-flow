package com.zmh.flow.app.statemachine;

/**
 * @program: rcmp-pls
 * @description: 执行状态枚举
 * 谨慎修改，通用枚举
 * @author: 周明浩
 * @create: 2022-07-26 16:11
 **/
public enum HandleStatusEnums {

    EXECUTE("0", "执行"),
    FAIL("1", "失败"),
    CANCEL("2", "取消"),
    ROLLBACK("3", "回退");

    HandleStatusEnums(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    private String code;

    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
