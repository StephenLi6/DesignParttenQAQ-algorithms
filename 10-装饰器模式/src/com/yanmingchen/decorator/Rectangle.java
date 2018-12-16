package com.yanmingchen.decorator;

/**
 * @Author: YanmingChen
 * @Date: Create in 16:28 2018/6/14
 * @Description:长方形类
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("长方形。。。");
    }

}
