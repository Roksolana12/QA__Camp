package oop_task;

public class EmployeeHourRate extends Employee {
    private double hourlyPayment;
    EmployeeHourRate(int ID, String name, String sex, double hourlyRate) {

       hourlyPayment =20.5*8*hourlyRate;
}

@Override
public double getSalary(){
        return 20.5*8*hourlyPayment;
}

}
