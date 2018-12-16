package com.yanmingchen.demo;

import com.yanmingchen.decorator.Circle;
import com.yanmingchen.decorator.Rectangle;
import com.yanmingchen.decorator.RedShapeDecorator;
import com.yanmingchen.decorator.Shape;

/**
 * @Author: YanmingChen
 * @Date: Create in 16:33 2018/6/14
 * @Description:
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("没有颜色的圆形。。。");
        circle.draw();

        System.out.println("\n红色的圆形。。。");
        redCircle.draw();

        System.out.println("\n红色的长方形。。。");
        redRectangle.draw();
    }

}
