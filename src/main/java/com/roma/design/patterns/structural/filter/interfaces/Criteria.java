package com.roma.design.patterns.structural.filter.interfaces;

import com.roma.design.patterns.structural.filter.classes.Person;

import java.util.List;

/**
 * Created by Roma on 5/7/16.
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);
}
