import java.text.SimpleDateFormat;
import java.util.*;

public class Main{
    Date date = new Date();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String str = format.format(date);
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = format.format(date);

        LogClass test = new LogClass("111.111.111", "Sam", str, "Sam bought 3 oranges for 5$" );

        System.out.print(test.getIP());
    }
}