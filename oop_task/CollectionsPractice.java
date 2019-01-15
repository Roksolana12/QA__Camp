package oop_task;

import java.util.Comparator;

public class CollectionsPractice implements Comparator<Employee>{

    @Override
    public int compare (Employee e1, Employee e2) {
        int salaryCompare = Double.compare(e1.getSalary(), e2.getSalary());
        if (salaryCompare != 0) {
            return salaryCompare;
        }
        else
            return e1.getName().compareTo(e2.getName());
    }


}
