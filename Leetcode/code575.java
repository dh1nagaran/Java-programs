class Solution {
    public int distributeCandies(int[] candyType) {
        int total=(int)candyType.length/2;
        Set<Integer> s=new HashSet<Integer>();
        for(int i=0;i<candyType.length;i++)
            s.add(candyType[i]);
        
        return Math.min(s.size(),total);     
    }
}