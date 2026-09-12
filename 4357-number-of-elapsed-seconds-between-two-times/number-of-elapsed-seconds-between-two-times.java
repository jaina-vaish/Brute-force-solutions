class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String sarr[]=startTime.split(":");
        String earr[]=endTime.split(":");
       // int hr=Integer.parseInt(sarr[0]);
        int stime=(Integer.parseInt(sarr[0])*3600)+(Integer.parseInt(sarr[1])*60)+(Integer.parseInt(sarr[2]));
        int etime=(Integer.parseInt(earr[0])*3600)+(Integer.parseInt(earr[1])*60)+(Integer.parseInt(earr[2]));
        return etime-stime;
    }
}