package com.yanmingchen.demo;

import com.yanmingchen.null_object.AbstractCustomer;
import com.yanmingchen.null_object.CustomerFactory;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:22 2018/6/15
 * @Description:
 */
public class NullPatternDemo {

    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }

}
