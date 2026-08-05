class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int j=0;
        for(int i=1;i<=arr[arr.length-1];i++)
        {
            if(arr[j]!=i)count++;
            else j++;
            if(count==k)return i;
        }   
        return arr[arr.length-1]+k-count;    
    }
}