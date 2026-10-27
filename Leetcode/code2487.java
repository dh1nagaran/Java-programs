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
    public ListNode removeNodes(ListNode head) {
        if(head==null ||head.next==null)return head;
        Stack<Integer> stack = new Stack<>();
        ListNode head1=head;
        while(head1!=null)
        {
            int num=head1.val;
            while (!stack.isEmpty() && stack.peek() < num) {
                    stack.pop();
            }
            stack.push(num);
            head1=head1.next;
        }
        ListNode heads=null;
        ListNode tails=null;
        for(int n:stack)
        {
            ListNode newNode=new ListNode(n);
            if(heads==null){
                heads=newNode;
                tails=newNode;
            }
            else{
                tails.next=newNode;
                tails=tails.next;
            }
        }
        if(tails.next!=null)tails.next=null;
        return heads;
            
    }
}c
