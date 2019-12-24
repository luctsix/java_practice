import java.io.*;
//import java.sql.Date;
import java.util.*;
import java.text.*;



public class DateTest{
    public static void main(String []args){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(date.toString());
        System.out.printf("%tc%n\n", date);
        try{
            Thread.sleep(5*1000);
            
            /*------------------------------ */
            Date now = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("GGGG yyyy-MM-dd EEE HH:mm:ss SSSS ");
            SimpleDateFormat ft2 = new SimpleDateFormat("GGGG yyyy-MM-dd EEE hh:mm:ss SSSS");
            System.out.println("1.current time is : " + ft.format(now));
            System.out.println("2.current time is : " + ft2.format(now));
        }
        catch(Exception e){
            System.out.println("got an exception: " + e);
        }

        Calendar c1 = Calendar.getInstance();
        c1.set(2019, 6 - 1, 12);
        int year = c1.get(Calendar.YEAR);
        int mon = c1.get(Calendar.MONTH);
        int date2 = c1.get(Calendar.DATE);
        int hour = c1.get(Calendar.HOUR);
        int minute = c1.get(Calendar.MINUTE);
        int second = c1.get(Calendar.SECOND);
        int day = c1.get(Calendar.DAY_OF_WEEK);
    }
}