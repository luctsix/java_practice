import java.io.*;

abstract class Animal{
    
    abstract void eat();
    
}

class Cat extends Animal{
    public void eat(){
        System.out.println("cat eats fish...");
    }
    public void work(){
        System.out.println("cat catches mouse...");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("dog eats bones...");
    }
    public void work(){
        System.out.println("dog look at the room...");
    }
}
public class MultiGestureTest{
    static int count = 0;
    public static void show(Animal a){
        System.out.printf("-----------cutting line %d ----------------\n", count++);
        a.eat();
        if(a instanceof Dog){
            Dog c = (Dog)a;
            c.work();
        }
        else if(a instanceof Cat){
            Cat c = (Cat)a;
            c.work();
        }
    }

    public static void main(String []args){
        show(new Cat());
        show(new Dog());

        System.out.printf("-----------cutting line %d ----------------\n", count++);

        Animal a = new Cat();
        a.eat();
        Cat c = (Cat)a;
        c.work();
    }
}