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
    public ListNode deleteMiddle(ListNode head) {
          if (head == null || head.next == null) {
            return null;
        }
        int count=0;
        ListNode head1=head;
        while(head1!=null)
        {
            head1=head1.next;
            count++;
        }
        int mid=count/2;
        count=0;
        ListNode head2=head;
        ListNode traverse=null;
        while(count<mid)
        {
            traverse=head2;
            head2=head2.next;
            count++;
        }
         traverse.next=head2.next;
        return head;
    }
}