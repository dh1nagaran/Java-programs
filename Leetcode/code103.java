class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> data=new ArrayList<>();
        int max=0;
        for(int n:candies)
            max=Math.max(max,n);
        for(int i=0;i<candies.length;i++)
            data.add(candies[i]+extraCandies>=max);
        return data; 
    }
}