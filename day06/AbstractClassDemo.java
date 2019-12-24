import java.io.*;

abstract class Employee{
    private String name;
    private String address;
    private int number;
    public Employee(String name, String address, int number){
        System.out.println("constructing an Employee....");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    // public double computePay(){
    //     System.out.println("Inside Employee computePay...");
    //     return 0.0;
    // }
    public abstract double computePay();
    
    public void mailCheck(){
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }
    public String toString(){
        return name + " " + address + " " + number;
    }
    public String  getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddresss){
        address = newAddresss;
    }
    public int getNumber(){
        return number;
    }
}
class Salary extends Employee{
    private double salary;
    public Salary(String name, String address, int number, double salary){
        //System.out.println("Constructing a Salary...");
        super(name, address, number);
        this.salary = salary;
    }
    public void mailCheck(){
        System.out.println("within mailCheck of Salary class...");
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if (newSalary >= 0.0){
            this.salary = newSalary;
        }
    }
    public double computePay(){
        System.out.println("Computing salary pay for " + getName());
        return salary / 52;
    }

}

public class AbstractClassDemo{
    public static void main(String []args){
        //Employee e = new Employee("qianqian", "zhangzhou", 18);
        Employee e = new Salary("qianqian", "zhangzhou", 18, 1888.00);
        Salary s = new Salary("qianniu", "xiamen", 18, 1111.00);

        System.out.println("Call mailCheck using Salary reference -- ");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference --");
        e.mailCheck();
    }
}