import java.io.*;
import java.lang.*;

class TestCharacter{
    Character ch = 'A';
    //char c = test('x');
}

public class TestMath{

    public static void main(String []args){
        System.out.println("90 degress's sin value: " + Math.sin(Math.PI/2));
        System.out.println("0 degress's cos value: " + Math.cos(0));
        System.out.println("60 degress's tan value: " + Math.tan(Math.PI/3));
        System.out.println("1 's atan value: " + Math.atan(1));
        System.out.println("Pi/2 's degree value: " + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);

        System.out.println("http://www.baidu.com");
        String str = "http://www.baidu.com";
        System.out.println(str.hashCode());

    }
}