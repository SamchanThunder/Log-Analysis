import java.util.*; 

public class LogClass {
    private String ip_Address;
    private String user;
    private String time;
    private String content;

    public LogClass(String givenIP, String givenUser, String givenTime, String givenContent){
        ip_Address = givenIP;
        user = givenUser;
        time = givenTime;
        content = givenContent;
    }

    public String getIP(){
        return ip_Address;
    }

    public String getUser(){
        return user;
    }

    public String getTime(){
        return time;
    }

    public String getContent(){
        return content;
    }

    @Override
    public String toString(){
        return ip_Address + " // " + user + " // " + time + " // " + content;
    }
}

