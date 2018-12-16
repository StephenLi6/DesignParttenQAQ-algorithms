package com.yanmingchen.command;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:09 2018/6/15
 * @Description:
 */
public class Stock {

    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
    }

}
