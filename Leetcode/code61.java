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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||head.next==null)return head;
        int count=0;
        ListNode head1=head;
        while(head1!=null)
        {
            count++;
            head1=head1.next;
        }
        k=k%count;
        k=count-k;
        if(k==0)return head;
        ListNode newNode2=null;
        ListNode newNode1=null;
        int count1=0;
        int count2=0;
        ListNode trav1=head;
        ListNode trav2=head;
        while(trav1!=null)
        {
            ListNode nextNode=new ListNode(trav1.val);
            if(count1>=k){
                if(newNode1==null){
                    newNode1=nextNode;
                    newNode2=nextNode;
                }else{
                    newNode2.next=nextNode;
                    newNode2=newNode2.next;
                }
            }
            count1++;
            trav1=trav1.next;
        }
        while(trav2!=null){
            ListNode nextNode=new ListNode(trav2.val);
            if(count2<k){
                if(newNode1==null){
                    newNode1=nextNode;
                    newNode2=nextNode;
                }else{
                    newNode2.next=nextNode;
                    newNode2=newNode2.next;
                }
            }
            count2++;
            trav2=trav2.next;
        }
        if(newNode2.next!=null)newNode2.next=null;
        return newNode1;    
    }
}
