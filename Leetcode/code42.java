class Solution {
    public int trap(int[] height) {
        int left=height[0];
        Stack<Integer> right=new Stack<>();
        right.push(height[height.length-1]);
        for(int i=height.length-2;i>=2;i--)
        {
            int temp=Math.max(right.peek(),height[i]);
            right.push(temp);
        }
        int total=0;
        for(int i=1;i<height.length-1;i++)
        {
            int min=Math.min(right.peek(),left);
            int temp=min-height[i];
            total+=Math.max(0,temp);
            right.pop();
            left=Math.max(left,height[i]);
        }
        return total;
        
    }
}