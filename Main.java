import java.text.SimpleDateFormat;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        new LogClass("123.456.789.000" , "Michael (Employee)" , "2024-07-01 11:47:57" , "Michael (Employee) sent 5000$ to Sofia", 57);

        new LogClass("999.999.999.999" , "Michael (Employee)" , "2024-07-01 11:47:59" , "Michael (Employee) sent 9000$ to Joseph", 59);

        new LogClass("999.999.999.999" , "Joseph" , "2024-07-01 11:48:01" , "Joseph sent 3000$ to Tim (Employee)", 61);

        new LogClass("222.222.222.222" , "Jack" , "2024-07-01 11:48:20" , "Jack sent 4000$ to Sam", 80);

        new LogClass("222.222.222.222" , "Ryan" , "2024-07-01 11:48:29" , "Ryan sent 2000$ to Jack" , 86);

        new LogClass("222.222.222.222" , "Jack" , "2024-07-01 11:48:27" , "Jack sent 2000$ to Sam" , 83);
    }
}