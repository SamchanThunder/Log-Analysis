import java.util.*;

public class Policies {

    //Policy_1: 2 or more users cannot be on the same IP Address within 5 seconds.
    private static LogClass compareLog;
    private static List<LogClass> withinSecondsList = new ArrayList<>();
    private static final int AMOUNT_OF_SECONDS = 5;
    public static List<LogClass> policy_1(LogClass log){
        List<LogClass> newLogs = new ArrayList<LogClass>();
        newLogs.add(log);

        if(compareLog != null){           
            if(compareLog.getEpochTime() + AMOUNT_OF_SECONDS < log.getEpochTime()){
                withinSecondsList = new ArrayList<LogClass>();        
            }
            withinSecondsList.add(log);

            List<LogClass> sameIPList = new ArrayList<LogClass>();

            for(LogClass subLog : withinSecondsList){
                if (subLog.getIP().equals(log.getIP())){
                    sameIPList.add(subLog);
                }
            }

            for(LogClass subLog: sameIPList){
                if(!(subLog.getUser().equals(log.getUser())) && log.getEpochTime() <= subLog.getEpochTime() + AMOUNT_OF_SECONDS){
                    newLogs.add(subLog);
                }
            }

            compareLog = log;
            return newLogs;
        }else{
            withinSecondsList.add(log);
            compareLog = log;
            return newLogs;
        }
    }
}
