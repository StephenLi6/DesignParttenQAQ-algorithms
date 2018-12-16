package com.yanmingchen.data_ccess_bject;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:56 2018/6/15
 * @Description:学生类
 */
public class Student {

    private String name;
    private int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

}
