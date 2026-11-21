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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode head1=head;
        int size=0;
        while(head1!=null){
            head1=head1.next;
            size++;
        }
        int nodes=size/k;
        int extra=size%k;
        System.out.println(nodes);
        System.out.println(extra);


        ListNode [] ls=new ListNode[k];
        ListNode trav=head;
        int count=0;
        ListNode parent=null;
        ListNode child=null;
        int indx=0;
        while(trav!=null){
            ListNode newNode=new ListNode(trav.val);
            count++;
            if(nodes>=count || extra>0){
                if(parent==null){
                    parent=newNode;
                    child=newNode;
                }else{
                    child.next=newNode;
                    child=child.next;
                }
                if(nodes<count){
                    extra--;
                    ls[indx++]=parent;
                    parent=null;
                    child=null;                    
                    count=0; 
                }else if(extra==0 && nodes==count){
                     ls[indx++]=parent;
                    parent=null;
                    child=null;                    
                    count=0; 
                }
            }else{
                ls[indx++]=parent;
                parent=newNode;
                child=newNode;
                count=0;
            }
            trav=trav.next;
        }
        if(nodes>=count && count!=0){
            ls[indx]=parent;
        }
        return ls;
    }
}