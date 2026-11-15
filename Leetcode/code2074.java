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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode head1=null;
        ListNode tail1=null;
        ListNode connect1=null;
        ListNode connect2=null;
        ListNode trav=head;
        int count=0;
        int k=1;
        while(trav!=null){
            count++;
            ListNode newNode=new ListNode(trav.val);
            if(connect1==null){
                connect1=newNode;
                connect2=newNode;
            }
            else{
                connect2.next=newNode;
                connect2=connect2.next;
            }
            if(count==k){
                ListNode temp=null;
                if(count%2==0){
                    temp=reverse(connect1);
                }else{
                    temp=connect1;
                }
                if(head1==null){
                    head1=temp;
                    tail1=temp;
                }else{
                    tail1.next=temp;
                }
                while(tail1.next!=null){
                    tail1=tail1.next;
                }
                count=0;
                k++;
                connect1=null;
                connect2=null;
            }
            trav=trav.next;
        }
        if(count>0){
            ListNode temp=null;
            if(count%2==0){
                temp=reverse(connect1);
            }
            else{
                temp=connect1;
            }
              if(head1==null){
                    head1=temp;
                    tail1=temp;
                }else{
                    tail1.next=temp;
                }
        }
        return head1; 
    }
    ListNode reverse(ListNode head){
        ListNode prev = null;
    ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}