package com.yanmingchen.singleton;

/**
 * @Author: YanmingChen
 * @Date: Create in 14:44 2018/6/14
 * @Description:单例对象
 */
public class SingleObject {

    /**
     * 创建 SingleObject 的一个对象
     */
    private static SingleObject instance = new SingleObject();

    /**
     * 让构造函数为 private，这样该类就不会被实例化
     */
    private SingleObject(){}

    /**
     * 获取唯一可用的对象
     * @return
     */
    public static SingleObject getInstance(){
        return instance;
    }

    /**
     * 打印信息
     */
    public void showMessage(){
        System.out.println("Hello World!");
    }

}
