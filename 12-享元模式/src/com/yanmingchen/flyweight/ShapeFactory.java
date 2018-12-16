package com.yanmingchen.flyweight;

import java.util.HashMap;

/**
 * @Author: YanmingChen
 * @Date: Create in 16:46 2018/6/14
 * @Description:图形工厂类
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
