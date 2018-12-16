package com.yanmingchen.proxy;

/**
 * @Author: YanmingChen
 * @Date: Create in 16:55 2018/6/14
 * @Description:代理图片类
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

}
