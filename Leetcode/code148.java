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
    public ListNode sortList(ListNode head) {
        if(head==null)return head;
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      ListNode ls=head;
      while(ls!=null){
        pq.add(ls.val);
        ls=ls.next;
      }
      ListNode head1=null;
      ListNode tail1=null;
      while (!pq.isEmpty()) 
      {
            ListNode newNode=new ListNode(pq.poll());
            if(head1==null){
                head1=newNode;
                tail1=newNode;
            }else{
                tail1.next=newNode;
                tail1=tail1.next;
            }
      }
      if(tail1.next!=null)tail1.next=null;
      return head1;    
    }
}
