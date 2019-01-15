package oop_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Employee> coll = new ArrayList<>();

        Employee Vika = new EmployeeHourRate(1,"Vika", "female", 80);



        coll.add(Vika);

        Collections.sort(coll, new CollectionsPractice());
}
