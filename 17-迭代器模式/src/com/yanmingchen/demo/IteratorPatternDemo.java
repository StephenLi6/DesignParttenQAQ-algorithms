package com.yanmingchen.demo;

import com.yanmingchen.iterator.Iterator;
import com.yanmingchen.iterator.NameRepository;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:28 2018/6/15
 * @Description:
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        Iterator iterator = namesRepository.getIterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println("Name : " + name);
        }
    }

}
