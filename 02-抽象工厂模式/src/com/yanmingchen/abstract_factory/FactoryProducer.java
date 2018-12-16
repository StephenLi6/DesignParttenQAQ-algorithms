package com.yanmingchen.abstract_factory;

/**
 * @Author: YanmingChen
 * @Date: Create in 14:35 2018/6/14
 * @Description:工厂提供类，用于提供不同工厂对象
 */
public class FactoryProducer {

    public static final String SHAPE = "SHAPE";
    public static final String COLOR = "COLOR";

    /**
     * 获取抽象工厂
     * @param choice 选择获取哪个工厂
     * @return 返回工厂对象
     */
    public static AbstractFactory getFactory(String choice) {
        if(SHAPE.equalsIgnoreCase(choice)){
            return new ShapeFactory();
        } else if(COLOR.equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }

}
