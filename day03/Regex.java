import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex{
    public static void main(final String[] args) {
        final String line = "This order was placed for QT3000! OK?";
        final String pattern = "(\\D*)(\\d+)(.*)";
        for (final String arg : args)
            System.out.print(arg + " ");
        System.out.println();
        final Pattern r = Pattern.compile(pattern);
        final Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("no match");
        }

        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[] { 1, 2, 3 });
    }

    /*  
    protected void finalize() throws java.lang.Throwable {
        super.finalize();
        System.out.println("end......");
    }
    */

    public static void printMax(final double... numbers) {
        if(numbers.length == 0){
            System.out.println("no args passed...");
            return;
        }

        double max = numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(numbers[i] > max)    max = numbers[i];
        }
        System.out.println("the max number is " + max);
    }
}