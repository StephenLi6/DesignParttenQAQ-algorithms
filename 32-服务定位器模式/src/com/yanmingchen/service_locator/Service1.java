package com.yanmingchen.service_locator;

/**
 * @Author: YanmingChen
 * @Date: Create in 11:11 2018/6/15
 * @Description:服务1类
 */
public class Service1 implements Service {

    @Override
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }

}
