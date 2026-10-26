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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        TreeMap<Integer,Integer>hs=new TreeMap<>();
        for(ListNode head1:lists)
        {
            while(head1!= null) {
                hs.put(head1.val, hs.getOrDefault(head1.val, 0) + 1);
                head1 = head1.next;
            }
        }
        if(hs.size()<=0)return null;
        ListNode head1=null;
        ListNode tail1=null;
        for(int n:hs.keySet())
        {
            for(int i=0;i<hs.get(n);i++)
            {
                ListNode ls=new ListNode(n);
                if(head1==null){
                    head1=ls;
                    tail1=ls;
                }else{
                    tail1.next=ls;
                    tail1=tail1.next;
                }

            }
        }
        if(tail1.next!=null)tail1.next=null;
        return head1;
        
    }
}