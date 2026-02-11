class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        Stack<Integer> s=new Stack<Integer>();
        for(int i=0;i<operations.length;i++)
        {
           if(operations[i].equals("D"))
           {
               int val=s.peek()*2;
                s.push(val);
           }
            else if(operations[i].equals("+"))
            {
                int val1=s.peek();
                int val2=s.get(s.size()-2);
                int tot=val1+val2;
                s.push(tot);
            }
            else if(operations[i].equals("C"))
                s.pop();

            else
                s.push(Integer.parseInt(operations[i]));
        }
        for(int m:s)
            sum+=m;
        return sum;
}

}