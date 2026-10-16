/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode head1=headA;
        ListNode tail1=headA;
        
        ListNode head2=headB;
        ListNode tail2=headB;
        int count1=0;
        int count2=0;
        while(tail1!=null || tail2!=null)
        {
            if(tail1!=null)
            {
                count1++;
                tail1=tail1.next;
            }
            
            if(tail2!=null){
                count2++;
                tail2=tail2.next;
            }
        }
        while(head1!=null || head2!=null)
        {
            if(count1>count2)
            {
                head1=head1.next;
                count1--;
            }
            else if(count2>count1){
                head2=head2.next;
                count2--;
            }
            else if(count1==count2)
            {
                if(head1==head2)return head1;
                head1=head1.next;
                head2=head2.next;
                count1--;
                count2--;
            }
        }
        return null;
    }

}