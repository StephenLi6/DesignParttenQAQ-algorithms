package com.yanmingchen.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: YanmingChen
 * @Date: Create in 16:12 2018/6/14
 * @Description:
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if("single".equalsIgnoreCase(person.getMaritalStatus())){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }

}
