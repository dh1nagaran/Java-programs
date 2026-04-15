class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int dis1 = 0;
        int right = startIndex;
        int left = startIndex;
        do{
            if (words[left].equals(target) || words[right].equals(target)) return dis1;
            dis1++;
            left--;
            right++;
            if(left==-1) left=words.length-1;
            if(right==words.length) right=0;
        }
        while(left!=startIndex+1 && right!=startIndex-1);
        return -1;
    }
}