package com.yanmingchen.proxy;

/**
 * @Author: YanmingChen
 * @Date: Create in 16:54 2018/6/14
 * @Description:真实图片类
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("显示图片：" + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("加载图片：" + fileName);
    }

}
