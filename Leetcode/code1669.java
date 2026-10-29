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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head1=null;
        ListNode tail1=null;
        ListNode trav=list1;
        int count=0;
        while(trav!=null)
        {
            if(count<a){
                if(head1==null){
                    head1=trav;
                    tail1=trav;
                }
                else{
                    tail1.next=trav;
                    tail1=tail1.next;
                }
            }
            else if(count==a){
                   if(head1==null){
                    head1=list2;
                    tail1=list2;
                }
                else{
                    tail1.next=list2;
                }
                while(tail1.next!=null)tail1=tail1.next;
            }
            else if(count>b){
                tail1.next=trav;
                tail1=tail1.next;
            }
            trav=trav.next;
            count++;
        }
        if(tail1.next!=null)tail1.next=null;
        return head1;
        
    }
}