package com.yanmingchen.transfer_object;

/**
 * @Author: YanmingChen
 * @Date: Create in 11:16 2018/6/15
 * @Description:学生类
 */
public class StudentVO {

    private String name;
    private int rollNo;

    StudentVO(String name, int rollNo) {
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
