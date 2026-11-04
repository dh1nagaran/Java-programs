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
    public ListNode partition(ListNode head, int x) {
        ListNode head1=null;
        ListNode tail1=null;
        ListNode trav=head;
        if(head==null){
            return head;
        }
        while(trav!=null){
            ListNode newNode=new ListNode(trav.val);
            if(trav.val<x){
                if(head1==null){
                    head1=newNode;
                    tail1=newNode;
                }
                else{
                    tail1.next=newNode;
                    tail1=tail1.next;
                }
            }  
            trav=trav.next;        
        }
        trav=head;
        while(trav!=null){
            ListNode newNode=new ListNode(trav.val);
            if(trav.val>=x){
                if(head1==null){
                    head1=newNode;
                    tail1=newNode;
                }
                else{
                    tail1.next=newNode;
                    tail1=tail1.next;
                }
            }
            trav=trav.next;         
        }
        if(tail1.next!=null)tail1.next=null;
        return head1;  
    }
}