// Last updated: 20/07/2026, 15:56:00
1class Solution {
2
3    public ListNode deleteDuplicates(ListNode head) {
4
5        ListNode dummy = new ListNode(0);
6        dummy.next = head;
7
8        ListNode prev = dummy;
9
10        while (head != null) {
11
12            while (head.next != null &&
13                   head.val == head.next.val)
14                head = head.next;
15
16            if (prev.next == head)
17                prev = prev.next;
18            else
19                prev.next = head.next;
20
21            head = head.next;
22        }
23
24        return dummy.next;
25    }
26}