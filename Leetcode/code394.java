import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<String> sk = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            String t = String.valueOf(s.charAt(i));
            if (!t.equals("]")) {
                sk.push(t);
            } else {
                String n = "";

                String m = sk.pop();
                while (!m.equals("[")) {
                    n = m + n; 
                    m = sk.pop();
                }
                String num = "";
                while (!sk.isEmpty() && Character.isDigit(sk.peek().charAt(0))) {
                    num = sk.pop() + num;
                }
                int repeat = Integer.parseInt(num);
                StringBuilder temp = new StringBuilder();
                for (int j = 0; j < repeat; j++) {
                    temp.append(n);
                }

                sk.push(temp.toString());
            }
            i++;
        }
        StringBuilder ans = new StringBuilder();
        while (!sk.isEmpty()) {
            ans.insert(0, sk.pop()); 
        }
        return ans.toString();
    }
}