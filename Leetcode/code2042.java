class Solution {
    public boolean areNumbersAscending(String s) {
        String nums[]=s.split(" ");
        int prev=0;
        for(String t:nums){
            char c=t.charAt(0);
            if(c>='0' && c<='9'){
                int num=Integer.parseInt(t);
                if(prev>=num)return false;
                prev=num;
            }
        }
        return true;
        
    }
}