package com.yanmingchen.decorator;

/**
 * @Author: YanmingChen
 * @Date: Create in 16:29 2018/6/14
 * @Description:图形装饰器抽象类
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }

}
