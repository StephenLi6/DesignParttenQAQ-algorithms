package com.yanmingchen.demo;

import com.yanmingchen.prototype.Shape;
import com.yanmingchen.prototype.ShapeCache;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:19 2018/6/14
 * @Description:
 */
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }

}
