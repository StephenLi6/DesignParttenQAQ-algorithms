package com.yanmingchen.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: YanmingChen
 * @Date: Create in 16:01 2018/6/14
 * @Description:女人标准
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if("female".equalsIgnoreCase(person.getGender())){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }

}
