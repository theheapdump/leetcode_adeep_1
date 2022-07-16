package easy.linked_list;

import ds.lists.ListNode;

/*
 * Algorithm -
 * Start from HEAD
 * Store nxt reference
 * Break cur -> cur.next & make cur.next -> prev LINK
 * Move prev ahead
 * Move cur ahead
 */
public class ReverseLinkedList {

  public ListNode reverseList(ListNode head) {
    ListNode prev = null, nxt = null;
    ListNode cur = head;
    while (cur != null) {
      nxt = cur.next;
      cur.next = prev;
      prev = cur;
      cur = nxt;
    }
    return prev;
  }
}
