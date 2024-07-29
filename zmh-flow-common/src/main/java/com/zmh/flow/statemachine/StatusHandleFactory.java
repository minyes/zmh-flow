package com.zmh.flow.statemachine;

/**
 * 通用状态处理工厂
 * @param
 */
public interface StatusHandleFactory {
    /**
     * 执行
     *
     * @param reqBO
     * @param respBO
     * @return
     */
    <S,D> D execute(S reqBO, Class<D> respBO);

    /**
     * 回退
     *
     * @param reqBO
     * @param respBO
     * @return
     */
    <S,D> D rollback(S reqBO, Class<D> respBO);

    /**
     * 取消
     *
     * @param reqBO
     * @param respBO
     * @return
     */
    <S,D> D cancel(S reqBO, Class<D> respBO);

}
