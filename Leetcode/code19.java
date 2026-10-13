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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==0)return null;
        int count=0;
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
            count++;
        }
         if(n==1 && count<=2)return prev.next;
         if(n==1){
           prev=prev.next;
         }
        ListNode head1=prev;
        ListNode tail=prev;
         count=1;
        while(tail!=null)
        {
            if(n-count==1 && n!=1)
            {
                ListNode nexts=tail.next.next;
                tail.next=nexts;
            }
            else{
                tail=tail.next;
            }
            count++;
        }
        
        ListNode prev2=null;
        ListNode curr2 = prev;
        while (curr2 != null) {
            ListNode nextNode = curr2.next;
            curr2.next = prev2;
            prev2 = curr2;
            curr2 = nextNode;
        }
        return prev2;   
    }
}