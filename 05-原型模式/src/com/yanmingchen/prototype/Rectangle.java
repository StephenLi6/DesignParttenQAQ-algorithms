package com.yanmingchen.prototype;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:11 2018/6/14
 * @Description:长方形
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("长方形。。。");
    }

}
