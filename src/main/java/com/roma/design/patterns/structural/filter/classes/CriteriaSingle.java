package com.roma.design.patterns.structural.filter.classes;

import com.roma.design.patterns.structural.filter.interfaces.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roma on 5/7/16.
 */
public class CriteriaSingle implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
