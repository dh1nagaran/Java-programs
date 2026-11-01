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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode head1=null;
        ListNode tail1=null;
        ListNode trav=head;
        int count=0;
        int tot=0;
        ListNode newNode=null;
        ListNode newNode2=null;
        while(trav!=null){
            count++;
            tot++;
            ListNode nodeData=new ListNode(trav.val);
            if(newNode2==null){
                newNode2=nodeData;
                newNode=nodeData;
                newNode.next=null;
            }
            else{
                newNode.next=nodeData;
                newNode=newNode.next;
            }

            if(count==k){
              ListNode temp=reverse(newNode2);
                if(head1==null){
                    head1=temp;
                    tail1=temp;
                }
                else{
                    tail1.next=temp;
                    tail1=temp;
                }
                while(tail1.next!=null){
                    tail1=tail1.next;
                }
                newNode=null;
                newNode2=null;
                count=0;
            }
            trav=trav.next;
        }
        if(tot<=k){
            return reverse(head);
        }
        if(count!=0){
            tail1.next=newNode2;
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