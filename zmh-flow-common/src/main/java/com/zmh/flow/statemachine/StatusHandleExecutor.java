package com.zmh.flow.statemachine;

/**
 * 通用状态处理类接口
 * @param <T>
 */
public interface StatusHandleExecutor<T> {

    /**
     * 执行前操作
     *
     * @param model
     */
    void executeBefore(T model, Object reqBO,Object resBO);

    /**
     * 执行方法
     */
    void execute(T model, Object reqBO,Object resBO);

    /**
     * 执行后操作
     *
     * @param model
     */
    void executeAfter(T model, Object reqBO,Object resBO);

    /**
     * bean创建时候 将当前bean 依赖给父类执行器中 方便事务传播到父类
     */
    void putHandleExecutor(StatusHandleExecutor<T> handleExecutor);


}
