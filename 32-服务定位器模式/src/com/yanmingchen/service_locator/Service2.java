package com.yanmingchen.service_locator;

/**
 * @Author: YanmingChen
 * @Date: Create in 11:12 2018/6/15
 * @Description:服务2类
 */
public class Service2 implements Service {

    @Override
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }

}
