class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        String movel=moves.replaceAll("_","L");
        String mover=moves.replaceAll("_","R");
        int count=0;
        int count1=0;
        for(int i=0;i<moves.length();i++)
        {
            if(movel.charAt(i)=='L')count++;
            else count--;
            if(mover.charAt(i)=='R')count1++;
            else count1--;
        }
        count=Math.abs(count);
        count1=Math.abs(count1);
        return Math.max(count,count1);
    }
}