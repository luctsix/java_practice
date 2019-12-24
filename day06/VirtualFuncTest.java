import java.io.*;

class Employee{
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number){
        System.out.println("Employee 's constructor function....");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public void mailCheck(){
        System.out.println("post check to:  " + this.name + " " + this.address); 
    }
    public String toString(){
        return name + " " + address + " " + number;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        this.address = newAddress;
    }
    public int getNumber(){
        return number;
    }
}

class Salary extends Employee{
    private double salary;

    public Salary(String name, String address, int number, double salary){
        super(name, address, number);
        this.salary = salary;
    }
    public void mailCheck(){
        System.out.println("Salary 's mailCheck func...");
        System.out.println("post check to : " + getName() +" , salary is : " + salary);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }
    public double computePay(){
        System.out.println("compute salary and pay for: " + getName());
        return salary/52;
    }
}


public class VirtualFuncTest{

    public static void main(String []args){
        Salary s = new Salary("qianA", "zhangzhou", 3, 13600.0);
        Employee e = new Salary("qianB", "xiamen", 2, 12400.0);

        System.out.println("use Salary's quote call mailCheck -- ");
        s.mailCheck();
        System.out.println("\nuse Employee's cite call mailCheck --");
        e.mailCheck();
    }
}