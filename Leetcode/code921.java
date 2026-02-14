class Solution {
    public int minAddToMakeValid(String s) {
    Stack<Character> t=new Stack<>();
    for(char ch:s.toCharArray())
    {
        if(ch==')')
        {
            if(!t.isEmpty()&&t.peek()=='(')
                t.pop();
            else
                t.push(ch);
        }
        else
            t.push(ch);
    }
    return t.size();
    }
}
