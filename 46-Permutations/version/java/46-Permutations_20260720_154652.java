// Last updated: 20/07/2026, 15:46:52
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
16    public ListNode rotateRight(ListNode head, int k) {
17
18        if (head == null || head.next == null || k == 0) {
19            return head;
20        }
21
22        // Find the length and last node
23        ListNode tail = head;
24        int length = 1;
25
26        while (tail.next != null) {
27            tail = tail.next;
28            length++;
29        }
30
31        // Reduce unnecessary rotations
32        k = k % length;
33
34        if (k == 0) {
35            return head;
36        }
37
38        // Make the list circular
39        tail.next = head;
40
41        // Find the new tail
42        int steps = length - k;
43        ListNode newTail = head;
44
45        for (int i = 1; i < steps; i++) {
46            newTail = newTail.next;
47        }
48
49        // New head
50        ListNode newHead = newTail.next;
51
52        // Break the circle
53        newTail.next = null;
54
55        return newHead;
56    }
57}