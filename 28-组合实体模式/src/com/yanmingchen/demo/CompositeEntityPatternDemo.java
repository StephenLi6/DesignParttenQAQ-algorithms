package com.yanmingchen.demo;

import com.yanmingchen.composite_entity.Client;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:54 2018/6/15
 * @Description:
 */
public class CompositeEntityPatternDemo {

    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }

}
