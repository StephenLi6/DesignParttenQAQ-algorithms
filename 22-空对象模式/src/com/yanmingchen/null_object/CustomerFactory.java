package com.yanmingchen.null_object;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:21 2018/6/15
 * @Description:客户工厂类
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }

}
