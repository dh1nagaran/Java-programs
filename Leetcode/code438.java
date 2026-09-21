class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        int m=s.length();
        char a[]=p.toCharArray();
        Arrays.sort(a);
        String k="";
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            k+=s.charAt(i);
            int len=k.length();
            if(len==n)
            {
                char b[]=k.toCharArray();
                Arrays.sort(b);
                if(Arrays.equals(a,b))ls.add(i-(len-1));
                k=k.substring(1);
            }
        }
        return ls;
        
    }
}