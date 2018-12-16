package com.yanmingchen.factory;

/**
 * @Author: YanmingChen
 * @Date: Create in 14:14 2018/6/14
 * @Description:图形工厂类，用于生成各种图形
 */
public class ShapeFactory {

    private static final String CIRCLE = "circle";
    private static final String RECTANGLE = "rectangle";
    private static final String SQUARE = "square";

    /**
     * 获取图形类型的对象方法
     * @return 绘画的图形
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if(CIRCLE.equalsIgnoreCase(shapeType)){
            return new Circle();
        } else if(RECTANGLE.equalsIgnoreCase(shapeType)){
            return new Rectangle();
        } else if(SQUARE.equalsIgnoreCase(shapeType)){
            return new Square();
        }
        return null;
    }

}
