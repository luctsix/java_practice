import java.lang.*;

public class RunInterface implements InterFaceDemo{
    public void eat(){
        System.out.println("Run interface demo 's eat funtion....");
    }
    public void travel(){
        System.out.println("qianqian wants to watch pandas and aurora...");
    }
    public int noOfLegs(){
        return 0;
    }
    public static void main(String []args){
        RunInterface run = new RunInterface();
        run.eat();
        run.travel();
    }
}