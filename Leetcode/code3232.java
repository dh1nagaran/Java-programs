class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0;
        int doubled=0;
        for(int n:nums)
        {
            if(n<=9)single+=n;
            else doubled+=n;
        }
        if(single==doubled) return false;
        return true;
    }
}