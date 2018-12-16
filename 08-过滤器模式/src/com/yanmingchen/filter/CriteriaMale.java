package com.yanmingchen.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: YanmingChen
 * @Date: Create in 16:00 2018/6/14
 * @Description:男人标准
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if("male".equalsIgnoreCase(person.getGender())){
                malePersons.add(person);
            }
        }
        return malePersons;
    }

}
