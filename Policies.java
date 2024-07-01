import java.util.*;

public class Policies {
    //Policy_1: 2 or more users cannot be on the same IP Address within 5 seconds.
    private static LogClass compareLogPolicy1;
    private static List<LogClass> withinSecondsListPolicy1 = new ArrayList<>();
    private static final int AMOUNT_OF_SECONDS_POLICY1 = 5;
    public static List<LogClass> policy_1(LogClass log){
        List<LogClass> newLogs = new ArrayList<LogClass>();
        newLogs.add(log);

        if(compareLogPolicy1 != null){           
            if(compareLogPolicy1.getEpochTime() + AMOUNT_OF_SECONDS_POLICY1 < log.getEpochTime()){
                withinSecondsListPolicy1 = new ArrayList<LogClass>();        
            }
            withinSecondsListPolicy1.add(log);

            List<LogClass> sameIPList = new ArrayList<LogClass>();

            for(LogClass subLog : withinSecondsListPolicy1){
                if (subLog.getIP().equals(log.getIP())){
                    sameIPList.add(subLog);
                }
            }

            for(LogClass subLog: sameIPList){
                if(!(subLog.getUser().equals(log.getUser())) && log.getEpochTime() <= subLog.getEpochTime() + AMOUNT_OF_SECONDS_POLICY1){
                    newLogs.add(subLog);
                }
            }

            compareLogPolicy1 = log;
            return newLogs;
        }else{
            withinSecondsListPolicy1.add(log);
            compareLogPolicy1 = log;
            return newLogs;
        }
    }
    //End of Policy_1

    //Policy_2: If the same user has has activity in different IP addresses within 5 seconds
    private static LogClass compareLogPolicy2;
    private static List<LogClass> withinSecondsListPolicy2 = new ArrayList<>();
    private static final int AMOUNT_OF_SECONDS_POLICY2 = 5;
    public static List<LogClass> policy_2(LogClass log){
        List<LogClass> newLogs = new ArrayList<LogClass>();
        newLogs.add(log);

        if(compareLogPolicy2 != null){           
            if(compareLogPolicy1.getEpochTime() + AMOUNT_OF_SECONDS_POLICY2 < log.getEpochTime()){
                withinSecondsListPolicy2 = new ArrayList<LogClass>();        
            }
            withinSecondsListPolicy2.add(log);

            for(LogClass subLog: withinSecondsListPolicy2){
                if(subLog.getUser().equals(log.getUser()) && !(subLog.getIP().equals(log.getIP())) && log.getEpochTime() <= subLog.getEpochTime() + AMOUNT_OF_SECONDS_POLICY2){
                    newLogs.add(subLog);
                }
            }

            compareLogPolicy2 = log;
            return newLogs;
        }else{
            withinSecondsListPolicy2.add(log);
            compareLogPolicy2 = log;
            return newLogs;
        }
        

    }

}
