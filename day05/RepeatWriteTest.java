import java.io.*;


class Animal{
    public void eat(){
        System.out.println("animal can eat");
    }
    public void move(){
        System.out.println("animal can move");
    }
}

class Dog extends Animal{
    public void move(){
        super.move();
        System.out.print("dog can run and walk...");
    }
    public void bark(){
        System.out.println("dog can bark.....");
    }
}

public class RepeatWriteTest{
    public static void  main(String []args){
        Animal a = new Animal();
        Animal b = new Dog();

        a.move();
        b.move();
        //b.bark();  //error//
    }
}