package com.roma.design.patterns.structural.filter.classes;

import com.roma.design.patterns.structural.filter.interfaces.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roma on 5/7/16.
 */
public class CriteriaFemale implements Criteria {

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
