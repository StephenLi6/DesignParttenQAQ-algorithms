package com.yanmingchen.service_locator;

/**
 * @Author: YanmingChen
 * @Date: Create in 11:12 2018/6/15
 * @Description:初始上下文类
 */
public class InitialContext {

    public Object lookup(String jndiName) {
        if ("SERVICE1".equalsIgnoreCase(jndiName)) {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if ("SERVICE2".equalsIgnoreCase(jndiName)) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }

}
