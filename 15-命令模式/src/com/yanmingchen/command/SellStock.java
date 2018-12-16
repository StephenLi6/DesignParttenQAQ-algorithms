package com.yanmingchen.command;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:11 2018/6/15
 * @Description:
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }

}
