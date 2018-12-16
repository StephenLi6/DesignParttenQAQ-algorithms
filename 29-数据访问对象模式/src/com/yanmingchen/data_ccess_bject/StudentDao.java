package com.yanmingchen.data_ccess_bject;

import java.util.List;

/**
 * @Author: YanmingChen
 * @Date: Create in 10:57 2018/6/15
 * @Description:学生数据访问接口
 */
public interface StudentDao {

    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);

}
