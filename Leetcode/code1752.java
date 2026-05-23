class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int copy[] = new int[n + n];
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            copy[i] = nums[i];
            copy[i + n] = nums[i];
            min=Math.min(min,nums[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(copy[i]==min && rotate(i,copy,n)) return true;
        }
        return false;
    }
    public static boolean rotate (int index,int arr[],int n)
    {
        for(int i=index+1;i<index+n;i++)
        {
            if(arr[i]-arr[i-1]<=-1) return false;
        }
        return true;
    }
}