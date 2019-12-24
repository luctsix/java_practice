import java.io.*;

class InsertType{
    byte    data1;   //1 byte   --- 8  bits
    short   data2;   //2 bytes  --- 16 bits
    int     data3;   //4 bytes  --- 32 bits
    long    data4;   //8 bytes  --- 64 bits
    float   data5;   //4 bytes  --- 32 bits;
    double  data6;   //8 bytes  --- 64 bits
    boolean data7;   //         --- 1  bits
    char    data8;   //         --- 16 bits
    String  data9;

    public void Print(){
        System.out.println("base type: byte's binary bits: " + Byte.SIZE);
        System.out.println("package type: java.lang.Byte");
        System.out.println("min value: " + Byte.MIN_VALUE);
        System.out.println("max value: " + Byte.MAX_VALUE);
        System.out.println("data1: " + data1);
        System.out.println("");

        System.out.println("base type: short's binary bits: " + Short.SIZE);
        System.out.println("package type: java.lang.Short");
        System.out.println("min value: " + Short.MIN_VALUE);
        System.out.println("max value: " + Short.MAX_VALUE);
        System.out.println("data2: " + data2);
        System.out.println("");

        System.out.println("base type: int's binary bits: " + Integer.SIZE);
        System.out.println("package type: java.lang.Integer");
        System.out.println("min value: " + Integer.MIN_VALUE);
        System.out.println("max value: " + Integer.MAX_VALUE);
        System.out.println("data3: " + data3);
        System.out.println("");

        System.out.println("base type: long's binary bits: " + Long.SIZE);
        System.out.println("package type: java.lang.Long");
        System.out.println("min value: " + Long.MIN_VALUE);
        System.out.println("max value: " + Long.MAX_VALUE);
        System.out.println("data4: " + data4);
        System.out.println("");

        System.out.println("base type: float's binary bits: " + Float.SIZE);
        System.out.println("package type: java.lang.Float");
        System.out.println("min value: " + Float.MIN_VALUE);
        System.out.println("max value: " + Float.MAX_VALUE);
        System.out.println("data5: " + data5);
        System.out.println("");

        System.out.println("base type: double's binary size: " + Double.SIZE);
        System.out.println("package type: java.lang.Double");
        System.out.println("min value: " + Double.MIN_VALUE);
        System.out.println("max value: " + Double.MAX_VALUE);
        System.out.println("data6: " + data6);
        System.out.println("");
/*  
        System.out.println("base type: boolea's binary bits: " + Boolean.SIZE);
        System.out.println("package type: java.lang.Boolean");
        System.out.println("min value: " + Boolean.MIN_VALUE);
        System.out.println("max value: " + Boolean.MAX_VALUE);
*/      System.out.println("data7: " + data7);
        System.out.println("");

        System.out.println("base type: char's binary bits: " + Character.SIZE);
        System.out.println("package type: java.lang.Character");
        System.out.println("min value: " + (int)Character.MIN_VALUE);
        System.out.println("max value: " + (int)Character.MAX_VALUE);
        System.out.println("data8: " + data8);
        System.out.println("");

        System.out.println("data9: " + data9);
        System.out.println("");

    }
}

class CiteType{
    
}

class ConstType{
    final double PI = 3.1415927;
    int decimal;
    int octal;
    int hexa;
    String name;
    public ConstType(){
        decimal = 100;
        octal = 0144;
        hexa = 0x64;
        name = "qianqian";
    }
}

public class DataTypeTest{
    public static void main(String []args){
        InsertType insert = new InsertType();
        insert.Print();

        System.out.println("ab\rcef\nghij\bklmnopqrstuvwx000ayz");

    }
}