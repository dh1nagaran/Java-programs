class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int i=0;
       int num[]=new int[n];
       for(int j=0;j<n;j++)
       {
            if(nums[j]<pivot)num[i++]=nums[j];
       }
       for(int j=0;j<n;j++)
       {
            if(nums[j]==pivot)num[i++]=nums[j];
       }
       for(int j=0;j<n;j++)
       {
            if(nums[j]>pivot)num[i++]=nums[j];
       }
       return num;
        
    }
}
