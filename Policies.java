import java.util.*;

public class Policies {

    //Policy_1: 2 or more users cannot be on the same IP Address within 5 seconds.
    //Function: It inputs all the logs. It finds every grouping of logs where there are 2 (or more) users on same IP address within 5 seconds. Returns a 2D Arraylist of logs.
    //Eg Output: [[Log1,Log2],[Log9,Log12,Log21]] --> Log1 and Log2 break the policy together. Log9, Log12, and Log21 break the policy together. 
    public List<List<LogClass>> policy_1(List<LogClass> logs){
        List<List<LogClass>> newLogs = new ArrayList<List<LogClass>>();

        //Group logs by IP Address in new 2d ArrayList named sameIPArrayList
        List<List<LogClass>> sameIP2DArrayList = new ArrayList<List<LogClass>>();
        List<String> keepTrack = new ArrayList<String>();
        
        for(LogClass log : logs){
            String log_IP = log.getIP();
            if(!keepTrack.contains(log_IP)){
                keepTrack.add(log_IP);
                sameIP2DArrayList.add(new ArrayList<LogClass>());
            }

            int index = keepTrack.indexOf(log_IP);
            sameIP2DArrayList.get(index).add(log);
        }

        //Loop through sameIPArrayList
        for(List<LogClass> logArray : sameIP2DArrayList){
            //Group logs that are within 5 seconds of each other named tempArrayList. [[all logs within 5 secs of IP 1] , [all logs within 5 secs of IP 2] , ...]
            List<List<LogClass>> tempArrayList = new ArrayList<List<LogClass>>();
            
            //Loop through tempArrayList

                //If a group has at least one diff user among each other, add that group to newLogs
        }
        //Remove duplicate groups from newLogs (meanign that they have the same exact elements in the group but diff order)
        return newLogs;
    }
}
