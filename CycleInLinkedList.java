public boolean hasCycle(ListNode head) {
        // Fast(.next.next) and Slow(.next) pointer
        // if at any point fast reached slow then it came via a cycle.
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
        // Below does not work - number is not primary identifier
        // LinkedList Cycle Check
        // Keep track of visited nodes and if a node is pointing to a visited node then it has a cycle
        // ListNode curr = head;
        // HashSet<Integer> visited = new HashSet<>();
        // while (curr != null) {
        //     if (visited.contains(curr.val)) {
        //         return true;
        //     }
        //     else {
        //         visited.add(curr.val);
        //     }
        //     curr = curr.next;
        // }
        // return false;
    }
