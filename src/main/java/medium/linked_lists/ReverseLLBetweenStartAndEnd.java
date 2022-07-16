package medium.linked_lists;

import ds.lists.ListNode;

public class ReverseLLBetweenStartAndEnd {

  public ListNode reverseBetween(ListNode head, int left, int right) {
    //  Edge Case 1
    if (head.next == null || left == right) {
      return head;
    }
    //  Edge Case 2
    if (head.next.next == null) {
      head.next.next = head;
      ListNode tmp = head.next;
      head.next = null;
      return tmp;
    }
    //Edge Case 3
    //[1,2,3]  : 1,2
    ListNode beforeLeft = null, leftNode = head;
    int count = 1;
    while (count != left) {
      count++;
      beforeLeft = leftNode;
      leftNode = leftNode.next;
    }
    System.out.println();
    // 7 5 2 8 9 1
    ListNode cur = leftNode;
    ListNode prev2 = null, nxt = null;
    while (cur != null && count != right) {
      count++;
      nxt = cur.next;
      cur.next = prev2;
      prev2 = cur;
      cur = nxt;
    }
    ListNode revHead = prev2;
    if (beforeLeft == null) {
      head = prev2;
    } else {
      beforeLeft.next = revHead;
      head = beforeLeft;
    }
    leftNode.next = nxt;
    return head;
  }
}
