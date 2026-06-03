class Solution {
    public String capitalizeTitle(String title) {
        String arr[]=title.split(" ");
        String ans="";
        for(String t:arr)
        {
            if(t.length()>2) ans+=t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()+" ";
            else ans+=t+" ";
        }        
        return ans.substring(0,ans.length()-1);
    }
}