package com.yanmingchen.decorator;

/**
 * @Author: YanmingChen
 * @Date: Create in 16:30 2018/6/14
 * @Description:红色图形装饰器类
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("红色面板。。。");
    }

}
