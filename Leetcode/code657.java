class Solution {
    public boolean judgeCircle(String moves) {
        int nums[] = new int[4];
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U')
                nums[0]++;
            if (moves.charAt(i) == 'D')
                nums[1]++;
            if (moves.charAt(i) == 'L')
                nums[2]++;
            if (moves.charAt(i) == 'R')
                nums[3]++;
        }
        if (nums[0] == nums[1] && nums[2] == nums[3])
            return true;
        return false;
    }
}