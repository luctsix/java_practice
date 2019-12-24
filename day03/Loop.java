import java.io.*;
import java.lang.*;

class Week{
    public static String []week = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
}

class ForLoop{
    public ForLoop(){
        System.out.println("test for loop....");
    }
    public void printWeek1(){
        for(int i = 0; i < Week.week.length; ++i)
        {
            System.out.println(Week.week[i]);
        }
        System.out.println("---- For Loop one -------------------");
    }
    public void printWeek2(){
        for(String weekday : Week.week)
        {
            System.out.println(weekday);
        }
        System.out.println("---- For Loop two -------------------");
    }
}
class WhileLoop{
    //String []Week = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};

    public WhileLoop(){
        System.out.println("test while loop....");
    }

    public void printWeek1(){
        int i = 0;
        while(i < 7)
        {
            System.out.println(Week.week[i++]);
        }
        System.out.println("---- while Loop one -------------------");
    }
}
class DoWhileLoop{
    //String []Week = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};

    public DoWhileLoop(){
        System.out.println("test do while loop....");
    }

    public void printWeek1(){
        int i = 0;
        do
        {
            try{
                System.out.println(Week.week[i]);
            }
            //catch(Exception e){
           //     System.out.println("excetion throw : " + e);
           //     System.out.println("excetion throw : " + e.getStackTrace());
           // }
            catch(ArrayStoreException e1){
                System.out.println("ArrayStoreException throw : " + e1);//
            }
            catch(ArrayIndexOutOfBoundsException e2){
                System.out.println("ArrayIndexOutOfBoundsException throw : " + e2);
            }
            catch(IllegalAccessError e3){
                System.out.println("IllegalAccessError throw : " + e3);
            }
            finally{
                goto A;
            }
        }while(++i <= 8);
    A:
        System.out.println("---- do while Loop one -------------------");
    }
}


public class Loop{
    public static void main(String []args){
        ForLoop loop1 = new ForLoop();
        loop1.printWeek1();
        loop1.printWeek2();

        WhileLoop loop2 = new WhileLoop();
        loop2.printWeek1();

        DoWhileLoop loop3 = new DoWhileLoop();
        loop3.printWeek1();
    }
}