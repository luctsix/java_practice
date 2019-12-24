import java.util.*;

public class ScannerDemo{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        System.out.println("next style receive: ");
        //if(scan.hasNext()){
        //     String str1 = scan.next();
        //     System.out.println("input data is : " + str1);
        // }
        if (scan.hasNextLine()){
            String str2 = scan.nextLine();
            System.out.println("input data is : " + str2);
        }
        System.out.print("input float number...");
        if (scan.hasNextFloat()) {
            float f = scan.nextFloat();
            System.out.println("get float: " + f);
        } else {
            System.out.println("the input is not float...");
        }
        scan.close();
    }
}