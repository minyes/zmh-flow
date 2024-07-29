package com.zmh.flow.statemachine;


/**
 * 公共抽象状态机处理工厂
 * 继承此类 需要实现 handle方法进行逻辑调用处理
 * execute 状态执行
 * rollback 状态回退
 * cancel 状态取消
 * 泛型：S 请求对象， D 响应对象
 * @program: rcmp-pls
 * @description:
 * @author: 周明浩
 * @create: 2022-07-31 18:53
 **/
//@Log4j2
public class AbstractStatusHandleFactory implements StatusHandleFactory {

    @Override
    public <S,D> D execute(S reqBO, Class<D> respBO) {
        return transactionHandle(reqBO, respBO, HandleStatusEnums.EXECUTE);
    }

    @Override
    public <S,D> D rollback(S reqBO, Class<D> respBO) {
        return transactionHandle(reqBO, respBO, HandleStatusEnums.ROLLBACK);
    }

    @Override
    public <S,D> D cancel(S reqBO, Class<D> respBO) {
        return transactionHandle(reqBO, respBO, HandleStatusEnums.CANCEL);
    }

    /**
     * 状态机调用
     * 调用此方法之心 子类的实现方法
     * @param reqBO
     * @param resBO
     * @param handleStatusEnums
     * @return
     */
    private <S,D> D transactionHandle(S reqBO, Class<D> resBO, HandleStatusEnums handleStatusEnums) {

        D reqObject= null;
        try {
            /**实例化响应对象*/
            reqObject = resBO.newInstance();
        } catch (Exception e) {
//            log.error("响应对象初始化失败！", e);
        }

        return this.handle(reqBO,reqObject,handleStatusEnums);
    }

    /**
     * 子类必须要重写这个方法
     * 此方法实现具体的业务逻辑
     * @param reqBO
     * @param respBO
     * @param handleStatusEnums
     * @param <D>
     * @return
     */
    protected <D> D handle(Object reqBO,D respBO,HandleStatusEnums handleStatusEnums) {
//        log.error("handle方法未重写！");
        return respBO;
    }
}
