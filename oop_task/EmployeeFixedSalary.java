package oop_task;

public class EmployeeFixedSalary extends Employee {
    private double fixedSalary ;
    public EmployeeFixedSalary(int ID, String name, String sex, double salary) {

          fixedSalary = salary;
    }

@Override
public double getSalary(){
        return fixedSalary;
}

}
