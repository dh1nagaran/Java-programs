class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.charAt(0)=='0')
        return false;

        int count=0;
        for(char ch:s.toCharArray())
        {
            if(count==1&&ch=='1')
            return false;

            if(ch=='0')
            count=1;
        }
        return true;
        
    }
}