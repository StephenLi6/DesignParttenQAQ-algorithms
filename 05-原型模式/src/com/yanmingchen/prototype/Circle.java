package com.yanmingchen.prototype;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:13 2018/6/14
 * @Description:圆形
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("圆形。。。");
    }

}
