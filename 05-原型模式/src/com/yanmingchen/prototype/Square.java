package com.yanmingchen.prototype;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:12 2018/6/14
 * @Description:正方形
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("正方形。。。");
    }

}
