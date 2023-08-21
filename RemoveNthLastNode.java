public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {
        
        // Replace this placeholder return statement with your code
        LinkedListNode left = head;
        LinkedListNode right = head;

        for (int i = 0; i < n; i++) {
            right = right.next;
        }

        if (right == null) {
            return head.next;
        }

        while (right.next != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;

        return head;
    }
