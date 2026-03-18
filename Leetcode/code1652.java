class Solution {
    public int[] decrypt(int[] code, int k) {
        int num[]=new int[code.length];
        int k2=Math.abs(k);
        for(int i=0;i<code.length;i++)
        {
            if(k==0)
                num[i]=0;
            else if(k<0)
                num[i]=minus(i-1,code,k2);
            else if(k>0)
                num[i]=plus(i+1,code,k);
        }
        return num;
        
    }
    public static int plus(int i,int a[],int k)
    {
        int add=0;
        int count=0;
        while(count<k)
        {
            if(i>a.length-1)
                i=0;

            add+=a[i++];
            count++;
            
        }
        return add;
    }
    public static int minus(int i,int a[],int k)
    {
        int add=0;
        int count=0;
        while(count<k)
        {
            if(i<=-1)
                i=a.length-1;
            
            add+=a[i--];
            count++;  
        }
        return add;
    }
}