package oop_task;

public abstract class Employee {
    private int ID;
    private String name;
    private String sex;
    private double salary;

    Employee(int ID, String name, String sex, double salary) {
        this.ID = ID;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    public Employee() {
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void printSalary(){
        System.out.println(ID+" "+name+" "+salary);
    }
  //  public double calculateSalary(){
     //   return salary;}

    public abstract double getSalary();
}
