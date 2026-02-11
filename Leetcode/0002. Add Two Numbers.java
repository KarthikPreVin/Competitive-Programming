class Solution {
    public ListNode recursiveAdd(ListNode l1, ListNode l2, int carry) {
        int sum;
        if (l1 == null && l2 == null) {
            if (carry == 0) {
                return null;
            } else {
                return new ListNode(carry);
            }
        }
        if (l1 == null) {
            sum = l2.val + carry;
            return new ListNode(sum % 10, recursiveAdd(l1, l2.next, sum / 10));
        }
        if (l2 == null) {
            sum = l1.val + carry;
            return new ListNode(sum % 10, recursiveAdd(l1.next, l2, sum / 10));
        }
        sum = l1.val + l2.val + carry;
        return new ListNode(sum % 10, recursiveAdd(l1.next, l2.next, sum / 10));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return recursiveAdd(l1, l2, 0);
    }
}