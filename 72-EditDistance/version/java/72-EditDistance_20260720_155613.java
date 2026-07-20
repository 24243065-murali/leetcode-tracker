// Last updated: 20/07/2026, 15:56:13
1class Solution {
2
3    public ListNode deleteDuplicates(ListNode head) {
4
5        ListNode current = head;
6
7        while (current != null &&
8               current.next != null) {
9
10            if (current.val == current.next.val)
11                current.next = current.next.next;
12            else
13                current = current.next;
14        }
15
16        return head;
17    }
18}