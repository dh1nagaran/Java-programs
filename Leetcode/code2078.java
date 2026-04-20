class Solution {
    public int maxDistance(int[] colors) {
        int max=Integer.MIN_VALUE;
        int n=colors.length;
        for(int i=0;i<n;i++)
        {
            if(colors[0]!=colors[i])
                max=Math.max(max,Math.abs(0-i));
            if(colors[n-1]!=colors[i])
                max=Math.max(max,Math.abs(i-(n-1)));            
        }
        return max;
         
    }
}