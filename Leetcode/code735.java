class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < asteroids.length; i++) {
            if (!s.isEmpty() && s.peek() > 0 && asteroids[i] < 0) {
                int num = Math.abs(s.peek());
                int num2 = Math.abs(asteroids[i]);
                if (num == num2)
                    s.pop();
                else if (num2 > num) {
                    s.pop();
                    i--;
                }
            } else
                s.push(asteroids[i]);
        }
        asteroids=new int[s.size()];
        int j=0;
        for(int n:s)
        {
            asteroids[j++]=n;
        }
        return asteroids;
    }
}