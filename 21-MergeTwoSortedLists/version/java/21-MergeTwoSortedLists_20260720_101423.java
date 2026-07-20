// Last updated: 20/07/2026, 10:14:23
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14
15class Solution {
16
17    public ListNode reverseKGroup(ListNode head, int k) {
18
19        if (head == null || k == 1)
20            return head;
21
22        ListNode dummy = new ListNode(0);
23        dummy.next = head;
24
25        ListNode prevGroup = dummy;
26
27        while (true) {
28
29            // Find the kth node
30            ListNode kth = prevGroup;
31
32            for (int i = 0; i < k && kth != null; i++) {
33                kth = kth.next;
34            }
35
36            if (kth == null)
37                break;
38
39            ListNode groupNext = kth.next;
40
41            // Reverse the group
42            ListNode prev = groupNext;
43            ListNode curr = prevGroup.next;
44
45            while (curr != groupNext) {
46                ListNode next = curr.next;
47                curr.next = prev;
48                prev = curr;
49                curr = next;
50            }
51
52            // Connect the reversed group
53            ListNode temp = prevGroup.next;
54            prevGroup.next = kth;
55            prevGroup = temp;
56        }
57
58        return dummy.next;
59    }
60}