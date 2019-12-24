import java.io.*;


class Variable{
    static int allClicks = 0;
    String str = "hello world";
    public void method(){
        int i = 0;
    }
}

public class AutoChangeType{
    public static void main(String []args){
        char c1= 'a';
        int i1 = c1;
        
        System.out.println("char auto change to int is " + i1);

        char c2 = 'A';
        int i2 = c2 + 1;
        System.out.println("char mod int is " + i2);

        byte b2 = (byte)i2;
        System.out.println("int force change to bytes is " + b2);

        int i = 129;
        byte b = (byte)i;
        System.out.println("int force change to byte is " + b); 
    }
}