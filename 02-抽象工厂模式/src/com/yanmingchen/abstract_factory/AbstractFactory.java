package com.yanmingchen.abstract_factory;

/**
 * @Author: YanmingChen
 * @Date: Create in 14:23 2018/6/14
 * @Description:抽象工厂类
 */
public abstract class AbstractFactory {

   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape) ;

}