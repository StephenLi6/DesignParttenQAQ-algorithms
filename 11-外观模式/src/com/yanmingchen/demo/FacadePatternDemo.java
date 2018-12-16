package com.yanmingchen.demo;

import com.yanmingchen.facade.ShapeMaker;

/**
 * @Author: YanmingChen
 * @Date: Create in 16:41 2018/6/14
 * @Description:
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
