class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
    List<Integer>ls=new ArrayList<>();
    int j=0;
    int orders[]=new int[friends.length];
    for(int n:friends)ls.add(n);
    for(int n:order)
    {
        if(ls.indexOf(n)!=-1)orders[j++]=n;
    }
    return orders;
    
        
    }
}