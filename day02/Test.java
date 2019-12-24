import java.io.*;

//访问修饰符


public class Test{
    public void pupAge(){
        int age = 0;
        age += 7;
        System.out.println("puppy's age is " + age);
    }

    public static void main(String []args){
        Test test = new Test();
        test.pupAge();
    }
}