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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode head1=null;
        ListNode tail1=null;
        ListNode trav=head;
        ListNode rev=null;
        ListNode rev2=null;
        int count=0;
        while(trav!=null){
            count++;
            ListNode newNode=new ListNode(trav.val);
            if(count>=left && count<=right){
                if(rev==null){
                    rev=newNode;
                    rev2=newNode;
                }
                else{
                    rev2.next=newNode;
                    rev2=rev2.next;
                }
                if(count==right){
                     if(head1==null){
                        head1=reverse(rev);
                        tail1=reverse(rev);
                    }
                    else{
                        tail1.next=reverse(rev);
                        while(tail1.next!=null){
                            tail1=tail1.next;
                        }
                    }
                }
            }else{
                if(count<left || count>right){
                    if(head1==null){
                        head1=newNode;
                        tail1=newNode;
                    }
                    else{
                        tail1.next=newNode;
                        tail1=tail1.next;
                    }
                }
            }
            trav=trav.next;
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
