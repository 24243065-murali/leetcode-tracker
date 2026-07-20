// Last updated: 20/07/2026, 10:13:32
1import java.util.PriorityQueue;
2
3class Solution {
4    public ListNode mergeKLists(ListNode[] lists) {
5
6        PriorityQueue<ListNode> pq = new PriorityQueue<>(
7            (a, b) -> a.val - b.val
8        );
9
10        // Add the first node of each list to the priority queue
11        for (ListNode node : lists) {
12            if (node != null) {
13                pq.offer(node);
14            }
15        }
16
17        ListNode dummy = new ListNode(-1);
18        ListNode current = dummy;
19
20        while (!pq.isEmpty()) {
21
22            ListNode node = pq.poll();
23            current.next = node;
24            current = current.next;
25
26            if (node.next != null) {
27                pq.offer(node.next);
28            }
29        }
30
31        return dummy.next;
32    }
33}