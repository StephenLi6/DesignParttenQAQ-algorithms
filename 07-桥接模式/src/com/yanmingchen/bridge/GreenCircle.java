package com.yanmingchen.bridge;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:51 2018/6/14
 * @Description:绿色圆形
 */
public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }

}
