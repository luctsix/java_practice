

class Color{
    enum ColorSize{RED,ORAGIN,YELLOW,GREEN,BLUE,PURPLE}
    ColorSize csize;
}

class Dog{
    String breed;
    int age;
    String color;
    String name;

    public Dog(){

    }
    public Dog(String name,String color){
        this.name = name;
        this.color = color;
    }

    public String Name(){return name;}
    public Integer Age(){return age;}
    public String Color(){return color;}
    public String Breed(){return breed;}
    
    public void barking(){
        System.out.println(Name() + " barking....");
    }
    public void hungry(){
        System.out.println(Name() + " is hungry...");
    }
    public void sleeping() {
        System.out.println(Name() + " is sleeping...");
    }
}

public class Puppy{
    public Puppy(String name){
        System.out.println("this dog's name is: " + name);
    }
    public static void main(String []args){
        //Puppy myPuppy = new Puppy("qian");
        Color mycolor = new Color();
        mycolor.csize = Color.ColorSize.BLUE;
        Dog mydog = new Dog("qianqian", "orange");

        mydog.barking();
        mydog.hungry();
        mydog.sleeping();

    }
}