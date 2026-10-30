class Solution {
    public ListNode doubleIt(ListNode head) {

        ListNode head1 = head;
        ListNode heads = null;
        ListNode tails = null;

        int carry = 0;
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        curr = prev;

        while (curr != null) {

            int sum = curr.val * 2 + carry;

            curr.val = sum % 10;
            carry = sum / 10;

            ListNode nextNode = curr.next;

            if (heads == null) {
                heads = curr;
                tails = curr;
            } else {
                tails.next = curr;
                tails = tails.next;
            }

            curr = nextNode;
        }
        if (carry > 0) {
            tails.next = new ListNode(carry);
        }

        curr = heads;
        prev = null;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
