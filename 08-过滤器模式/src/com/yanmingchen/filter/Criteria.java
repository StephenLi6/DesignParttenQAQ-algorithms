package com.yanmingchen.filter;

import java.util.List;

/**
 * @Author: YanmingChen
 * @Date: Create in 15:59 2018/6/14
 * @Description:标准接口
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);

}
