class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode pointer = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                pointer.next = list1;
                pointer = pointer.next;
                list1 = list1.next;
            } else {
                pointer.next = list2;
                pointer = pointer.next;
                list2 = list2.next;
            }
        }

        if (list1 != null) {
            pointer.next = list1;
        } else {
            pointer.next = list2;
        }

        return head.next;
    }
}