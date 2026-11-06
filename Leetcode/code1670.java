
class FrontMiddleBackQueue {
    int tot = 0;
    Node head = null;

    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public FrontMiddleBackQueue() {

    }

    public void pushFront(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        tot++;
    }

    public void pushMiddle(int val) {
        Node newNode = new Node(val);
        int mid = tot / 2;
        if (head == null) {
            head = newNode;
            tot++;
            return;
        }
        if (mid == 0) {
            newNode.next = head;
            head = newNode;
            tot++;
            return;
        }

        Node head1 = head;

        for (int i = 1; i < mid; i++) {
            head1 = head1.next;
        }

        newNode.next = head1.next;
        head1.next = newNode;

        tot++;
    }

    public void pushBack(int val) {
        Node newNode = new Node(val);
        tot++;

        if (head == null) {
            head = newNode;
            return;
        }

        Node head1 = head;

        while (head1.next != null) {
            head1 = head1.next;
        }

        head1.next = newNode;
    }

    public int popFront() {
        if (head == null) {
            return -1;
        }

        int value = head.val;
        head = head.next;
        tot--;

        return value;
    }

    public int popMiddle() {
        if (head == null) {
            return -1;
        }
        int mid = (tot - 1) / 2;
        if (mid == 0) {
            int value = head.val;
            head = head.next;
            tot--;
            return value;
        }
        Node head1 = head;
        for (int i = 1; i < mid; i++) {
            head1 = head1.next;
        }
        int value = head1.next.val;
        head1.next = head1.next.next;
        tot--;
        return value;
    }

    public int popBack() {
        if (head == null) {
            return -1;
        }
        if (head.next == null) {
            int value = head.val;
            head = null;
            tot--;
            return value;
        }
        Node head1 = head;
        while (head1.next.next != null) {
            head1 = head1.next;
        }
        int value = head1.next.val;
        head1.next = null;
        tot--;
        return value;
    }
}
