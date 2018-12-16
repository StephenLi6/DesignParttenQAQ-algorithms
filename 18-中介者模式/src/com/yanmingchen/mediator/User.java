package com.yanmingchen.mediator;

/**
 * @Author: YanmingChen
 * @Date: Create in 9:37 2018/6/15
 * @Description:用户类
 */
public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }

}
