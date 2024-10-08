package com.zmh.flow.app.statemachine;

public interface StatusHandleEnum<T> {
    /**
     * 获得下个一个状态
     *
     * @param handleStatusEnums
     * @return
     */
    T getNextStatus(HandleStatusEnums handleStatusEnums);
}
