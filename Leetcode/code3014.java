class Solution {
    public int minimumPushes(String word) {
        int n=word.length()-1;
        int sum=0;
        for(int i=0;i<=n;i++) sum+=Math.floor(i/8)+1;
        return sum;
        
    }
}
