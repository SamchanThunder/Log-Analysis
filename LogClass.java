import java.util.*; 

public class LogClass {
    private String ip_Address;
    private String user;
    private String time;
    private String content;
    //Epoch time will get the amount of seconds since a certain time like 1970 0AM UTC.
    private int epochTime;

    public LogClass(String givenIP, String givenUser, String givenTime, String givenContent, int givenEpochTime){
        ip_Address = givenIP;
        user = givenUser;
        time = givenTime;
        content = givenContent;
        epochTime = givenEpochTime;

        List<LogClass> policy_1_break = Policies.policy_1(this);
        List<LogClass> policy_2_break = Policies.policy_2(this);
        LogClass policy_3_break = Policies.policy_3(this);
        LogClass policy_4_break = Policies.policy_4(this);
        List<LogClass> policy_5_break = Policies.policy_5(this);


        if (policy_1_break.size() >= 2){
            System.out.println("These logs break Policy 1:");
            for(LogClass subLog : policy_1_break){
                System.out.println(subLog.toString());
            }
        }
        if (policy_2_break.size() >= 2){
            System.out.println("These logs break Policy 2:");
            for(LogClass subLog : policy_2_break){
                System.out.println(subLog.toString());
            }
        }
        if (policy_3_break != null){
            System.out.println("This log breaks Policy 3:");
            System.out.println(policy_3_break.toString());
        }
        if (policy_4_break != null){
            System.out.println("This log breaks Policy 4:");
            System.out.println(policy_4_break.toString());
        }
        if (policy_5_break.size() > 2){
            System.out.println("These logs break Policy 5:");
            for(LogClass subLog : policy_5_break){
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