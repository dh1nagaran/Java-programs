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
    public boolean isPalindrome(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
			prev=curr;
			curr=next;
        }
        ListNode head1=head;
        while(head1!=null)
        {
            if(head1.val!=prev.val)return false;
            head1=head1.next;
            prev=prev.next;
        }
        return true;
    }
}