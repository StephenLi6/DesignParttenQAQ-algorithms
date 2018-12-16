package com.yanmingchen.prototype;

import java.util.Hashtable;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:15 2018/6/14
 * @Description:图形缓存
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种图形都运行数据库查询，并创建该图形
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种图形
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }

}
