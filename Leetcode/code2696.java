class code2696 {
    public static main(String[] args) {
		String s = "ABFCACDB";
        Stack <Character> n=new Stack<Character>();
       for(char a:s.toCharArray())
       {
            if(!n.isEmpty() && ((n.peek()=='A' && a=='B') || (n.peek()=='C' && a=='D')))
            {
                n.pop();
            }
            else{
                n.push(a);
            }

       }
        System.out.println(n.size());
        
    }
}