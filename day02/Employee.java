import java.io.*;

public class Employee{
    public String name;
    private double salary;
    int age;
    String designation;

    public static int ALLCOUNT = 1;

    public Employee(String name){
        System.out.println("this is the " + ALLCOUNT + " player that is been construct...");
        allCount++;
        this.name = name;
    }
    public void setAge(int age){this.age = age;}
    public void setDesignation(String des){this.designation = des;}
    public void setSalary(int sal) {this.salary = sal;}

    public void PrintInfo(){
        System.out.println("name: " + name);
        System.out.println("age : " + age);
        System.out.println("des : " + designation);
        System.out.println("sal: " + salary);

    }
}