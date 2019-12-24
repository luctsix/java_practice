import java.io.*;

class Animal{
    private String name;
    private int id;
    public Animal(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void eat(){
        System.out.println(name + " is eating...");
    }
    public void sleep(){
        System.out.println(name + " is sleeping...");
    }
    public void intriduction(){
        System.out.println("hello, everyone! my name is "+name+", id is " + id);
    }
}

class Penguin extends Animal{
    public Penguin(String name, int id){
        super(name, id);
    }
}
class Mouse extends Animal{
    public Mouse(String name, int id){
        super(name, id);
    }
}


public class InheritTest{
    public static void main(String[] args){
        Mouse mouse = new Mouse("mouse", 950000);
        mouse.eat();
        mouse.sleep();
        mouse.intriduction();

        Penguin penguin = new Penguin("penguin", 950001);
        penguin.eat();
        penguin.sleep();
        penguin.intriduction();


    }
}