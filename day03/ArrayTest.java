import java.io.*;

class Employee{
    public String name;
    public int age;
    public String address;
    public String telephone;
}

public class ArrayTest{
    public static void main(String []args){
        int[] mylist;
        mylist = new int[10];
        for (int i=0; i<10; ++i)
        {
            mylist[i] = i;
        }
        for (int i : mylist)
        {
            try{
                System.out.printf("mylist[%d] = %d\n", i, i);
            }
            catch(Exception e) {
                System.out.println("throw exception: " + e);
            }
        }
        try{
        Employee[] emps;
        emps = new Employee[10];
        int i = 0;
        while(i < 10)
        {
            Employee emp = new Employee();
            emp.name = "qianqian" + i;
            emp.address = "zhangzhou" + i;
            emp.age = 12+i;
            emp.telephone = "1519589132" + i;
            emps[i++] = emp;
        }
        for(Employee e : emps)
        {
            System.out.printf("Name:%s\tage:%d\taddr:%s\ttel:%s\n",
                e.name, e.age, e.address, e.telephone);
        }
    }catch(Exception e){
        System.out.println("throws exception: " + e);
        System.out.println("throws exception: " + e.getStackTrace());
    }
    }
}