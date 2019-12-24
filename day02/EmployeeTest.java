import java.io.*;

public class EmployeeTest{
    public static void main(String []args){
        Employee empOne = new Employee("xiaoqian");

        empOne.setAge(18);
        empOne.setDesignation("zhangzhou");
        empOne.setSalary(888888);
        empOne.PrintInfo();
        //System.out.println("allCount is " + Employee.allCount);
        
        System.out.println();
        
        Employee empTwo = new Employee("qianqian");
        empTwo.setAge(16);
        empTwo.setDesignation("xiamen");
        empTwo.setSalary(950000);
        empTwo.PrintInfo();
        System.out.println("allCount is " + Employee.allCount);
    }
}
