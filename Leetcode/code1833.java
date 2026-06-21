class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count=0;
        Arrays.sort(costs);
        for(int n:costs)
        {
            if(n<=coins)
            {
                coins-=n;
                count++;
            }

        }
        return count;
    }
}