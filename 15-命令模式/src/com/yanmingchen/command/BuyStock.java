package com.yanmingchen.command;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:10 2018/6/15
 * @Description:
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }

}
