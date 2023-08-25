public ListNode middleNode(ListNode head) {
        // return middle node; if two middle node, return the second one.
        // int counter
        // two pointers approach - curr keeps moving next
        // mid pointer - every two moves
        ListNode curr = head, mid = head;
        boolean moveMid = false;
        while(curr != null)  {
            if (moveMid) {
                mid = mid.next;
                moveMid = false;
            } else {
                moveMid = true;
            }
            curr = curr.next;
        }
        return mid;
    }
