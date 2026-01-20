class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int c=0,m=0,f=0;
        int l[]=new int[9999];
        for(int i:nums1){
            c=0;f=0;
            for(int j:nums2){
                if(i==j)
                c=1;
            }
            if(c!=0)
            {
                for(int d=0;d<m;d++)
                {
                    if(i==l[d])
                    f=1;
                }
                if(f==0)
               { l[m]=i;
                m++;}
            }
        }
       int y[]=new int[m];
	for(int i=0;i<m;i++)	
			y[i]=l[i];
return y;
        
    }
}