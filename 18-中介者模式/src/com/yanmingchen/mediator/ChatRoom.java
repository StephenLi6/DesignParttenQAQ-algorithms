package com.yanmingchen.mediator;

import java.util.Date;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:36 2018/6/15
 * @Description:聊天室类
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [" + user.getName() + "] : " + message);
    }

}
