class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode out = null, head = null;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                if (out == null) {
                    out = new ListNode(list2.val);
                    head = out;
                    list2 = list2.next;
                } else {
                    out.next = new ListNode(list2.val);
                    out = out.next;
                    list2 = list2.next;
                }
            } else if (list2 == null) {
                if (out == null) {
                    out = new ListNode(list1.val);
                    head = out;
                    list1 = list1.next;
                } else {
                    out.next = new ListNode(list1.val);
                    out = out.next;
                    list1 = list1.next;
                }
            } else {
                if (list1.val < list2.val) {
                    if (out == null) {
                        out = new ListNode(list1.val);
                        head = out;
                        list1 = list1.next;
                    } else {
                        out.next = new ListNode(list1.val);
                        out = out.next;
                        list1 = list1.next;
                    }
                } else {
                    if (out == null) {
                        out = new ListNode(list2.val);
                        head = out;
                        list2 = list2.next;
                    } else {
                        out.next = new ListNode(list2.val);
                        out = out.next;
                        list2 = list2.next;
                    }
                }
            }
        }
        return head;

    }
}