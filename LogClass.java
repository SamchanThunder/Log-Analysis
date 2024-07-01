import java.util.*; 

public class LogClass {
    private String ip_Address;
    private String user;
    private String time;
    private String content;
    //Epoch time will get the amount of seconds since 1970 0AM UTC.
    private int epochTime;

    public LogClass(String givenIP, String givenUser, String givenTime, String givenContent, int givenEpochTime){
        ip_Address = givenIP;
        user = givenUser;
        time = givenTime;
        content = givenContent;
        epochTime = givenEpochTime;
        List<LogClass> policy_1_break = Policies.policy_1(this);
        if (policy_1_break.size() >= 2){
            System.out.println("These logs break policy 1:");
            for(LogClass subLog : policy_1_break){
                System.out.println(subLog.toString());
            }
        }
    };

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

    public int getEpochTime(){
        return epochTime;
    }

    @Override
    public String toString(){
        return ip_Address + " // " + user + " // " + time + " // " + content;
    }
}

