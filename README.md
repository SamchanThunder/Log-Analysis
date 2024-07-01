**Log Analysis**

Computer Activity of the public who is on a company's service and of the employees of the company are recorded on logs. A log records IP Address, User, Date of Activity, and Content of the Activity. 
All logs are sent to a database, where they are all stored. These logs are analyzed through policies to find any suspicious activity to prevent exploitation and major mistakes that could damage the company. If a policy is broken, then admins are notified of the policy that is broken and the logs associated with it. Everytime a log is created, the policies are checked. 

**Current Log Policies for Company A:**

1. 2 or more users cannot be on the same IP Address within 5 seconds.

2. The same user cannot have activity on different IP addresses within 5 seconds.

**Simplified Example with Transaction Logs for Company A:**

*Log 1:* IP: 123.456.789.000 // User: Michael (Employee) // Date: 2024-07-01 11:47:57 // Content: Michael (Employee) sent 5000$ to Sofia

*Log 2:* IP: 999.999.999.999 // User: Michael (Employee) // Date: 2024-07-01 11:47:59 // Content: Michael (Employee) sent 9000$ to Joseph

*Log 3:* IP: 999.999.999.999 // User: Joseph // Date: 2024-07-01 11:48:01// Content: Joseph sent 3000$ to Tim (Employee)

*Log 4:* IP: 222.222.222.222 // User: Jack // Date: 2024-07-01 11:48:20 // Content: Jack sent 2000$ to Sam

*Log 5:* IP: 222.222.222.222 // User: Ryan // Date: 2024-07-01 11:48:26 // Content: Ryan sent 2000$ to Jack

**Example Administrator Output:**

These Logs Break Policy 2: Log 1,Log 2

These Logs Break Policy 1: Log 4, Log 5

**Reason:**

Log 1 and 2 break policy 2 because the same user has activity on two different IP addresses within 5 seconds. 

Log 3 and 4 break policy 1 because two users have activity on the same IP Address within 5 seconds. 

Log 4 and Log 5 do not break policy 1 because Log 5 is 6 seconds after Log 4