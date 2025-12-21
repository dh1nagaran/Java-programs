class maxthree

{
	public static void main(String[] args) 
	{
		int nums[]={1,2,3,4}
		 Arrays.sort(nums);
        int n=nums.length;
        int mul1=nums[0]*nums[1]*nums[n-1];
        int mul2=nums[n-1]*nums[n-2]*nums[n-3];
       System.out.println(Math.max(mul1,mul2));
	}
}
