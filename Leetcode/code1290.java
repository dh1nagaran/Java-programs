
class Solution {
    public int getDecimalValue(ListNode head) {
        int st=1;
        int sum=0;
        ListNode list=head;
        ListNode list1=head;
        while(list!=null)
        {
            st*=2;
            list=list.next;
        }
        st/=2;
        while(list1!=null)
        {
            int temp=list1.val;
            sum+=temp*st;
            st/=2;
            list1=list1.next;
        }
        return sum;
        
    }
}