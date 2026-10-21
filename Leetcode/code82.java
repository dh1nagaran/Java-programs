/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode head1=null;
        ListNode trav=head;
        ListNode tail1=null;
        int count=1;
        while(trav!=null && trav.next!=null)
        {
            int curr=trav.val;
            int next=trav.next.val;
            if(curr!=next )
            {
                if(head1==null && count==1)
                {
                    head1=trav;
                    tail1=trav;
                }
                else{
                    if(count==1)
                    {
                        tail1.next=trav;
                        tail1=tail1.next;
                    }
                }
                count=1;
            }
            else{
                count++;
            }
            trav=trav.next;
        }
        if(trav!=null && count==1)
        {
            if(head1==null){
                return trav;
            }else{
            tail1.next=trav;
            tail1=tail1.next;
            }
        }
         if (tail1 != null) {
            tail1.next = null;
        }
        return head1;
        
    }
}