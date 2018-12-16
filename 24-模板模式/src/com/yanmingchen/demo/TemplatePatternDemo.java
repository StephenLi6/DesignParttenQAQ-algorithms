package com.yanmingchen.demo;

import com.yanmingchen.template.Cricket;
import com.yanmingchen.template.Football;
import com.yanmingchen.template.Game;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:30 2018/6/15
 * @Description:
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
