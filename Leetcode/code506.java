class Solution {
    public String[] findRelativeRanks(int[] score) {
        TreeMap<Integer,Integer> maps=new TreeMap<Integer,Integer>(Collections.reverseOrder());
        int n=score.length;
        String res[]=new String[n];
        for(int i=0;i<n;i++)
            maps.put(score[i],i);
        int rank=1;
        for(int key:maps.keySet())
        {
            int index=maps.get(key);
            if(rank==1)
                res[index]="Gold Medal";
            else if(rank==2)
                res[index]="Silver Medal";
            else if(rank==3)
                res[index]="Bronze Medal";
            else
                res[index]=String.valueOf(rank);
             rank++;
        }
        return res; 
    }
}