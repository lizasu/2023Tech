public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Given two sorted linked lists list1, list2
        // Merge into one sorted list
        // can have repeated numbers in the final sorted linked list
        ListNode curr = new ListNode(0);
        ListNode result = curr;
        while (list1 != null && list2 != null) {
            int num1 = list1.val;
            int num2 = list2.val;
            if (num1 > num2) {
                curr.next = new ListNode(num2);
                list2 = list2.next;
            } 
            else  { 
                curr.next = new ListNode(num1);
                list1 = list1.next;
            }
            curr = curr.next;
        }
        if (list1!= null) {
            curr.next = list1;
        }
        if (list2 != null) {
            curr.next = list2;
        }
    
        return result.next;
    }
