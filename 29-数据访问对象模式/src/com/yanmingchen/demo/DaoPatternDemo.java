package com.yanmingchen.demo;

import com.yanmingchen.data_ccess_bject.Student;
import com.yanmingchen.data_ccess_bject.StudentDao;
import com.yanmingchen.data_ccess_bject.StudentDaoImpl;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:58 2018/6/15
 * @Description:
 */
public class DaoPatternDemo {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //输出所有的学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }

        //更新学生
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "
                + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }

}
