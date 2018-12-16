package com.yanmingchen.demo;

import com.yanmingchen.bridge.Circle;
import com.yanmingchen.bridge.GreenCircle;
import com.yanmingchen.bridge.RedCircle;
import com.yanmingchen.bridge.Shape;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:54 2018/6/14
 * @Description:
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
