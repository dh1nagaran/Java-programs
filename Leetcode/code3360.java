class Solution {
    public boolean canAliceWin(int n) {
        if(n<=9)return false;
        int temp=n;
        int remove=10;
        int count=0;
        while(temp>=remove){
            temp-=remove;
            count++;
            remove--;
        }
        if(count%2==0 || remove<temp)return false;
        return true;
    }
}
