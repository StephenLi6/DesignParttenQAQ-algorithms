package com.yanmingchen.demo;

import com.yanmingchen.command.Broker;
import com.yanmingchen.command.BuyStock;
import com.yanmingchen.command.SellStock;
import com.yanmingchen.command.Stock;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:12 2018/6/15
 * @Description:
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}
