# acm

This program is my solution for the ACM contest scoring problem on Kattis


https://open.kattis.com/problems/acm
Author of problem: Andrew Harrington
originally from: 2015 ICPC Mid-Central Regional

----------------------------------------------------

Problem: 
The rank of a team relative to others is determined by a primary and secondary scoring measure calculated from the submission data. The primary measure is the number of problems that were solved. The secondary measure is based on a combination of time and penalties. Specifically, a team’s time score is equal to the sum of those submission times that resulted in right answers, plus a 20-minute penalty for each wrong submission of a problem that is ultimately solved. If no problems are solved, the time measure is 0.

According to contest rules, after a team solves a particular problem, any further submissions of the same problem are ignored (and thus omitted from the log). Because times are discretized to whole minutes, there may be more than one submission showing the same number of minutes. In particular there could be more than one submission of the same problem in the same minute, but they are chronological, so only the last entry could possibly be correct.

---------------------------------------------------

Sample Input:
3 E right
10 A wrong
30 C wrong
50 B wrong
100 A wrong
200 A right
250 C wrong
300 D right
-1

Sample Output:
3 543