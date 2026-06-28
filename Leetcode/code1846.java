class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n=arr.length;
       int arr2[]=new int[n];
       arr2[0]=1;
       int max=1;
       Arrays.sort(arr);
       for(int i=1;i<n;i++)
       {
        if(Math.abs(arr2[i-1]-arr[i])<=1)arr2[i]=arr[i];
        else arr2[i]=arr2[i-1]+1;
        max=Math.max(arr2[i-1],arr2[i]);
       }
       return max;

    }
}