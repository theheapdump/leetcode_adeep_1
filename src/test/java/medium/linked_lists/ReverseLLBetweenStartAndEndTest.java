package medium.linked_lists;

import ds.lists.ListNode;
import org.junit.jupiter.api.Test;
import util.Utils;

public class ReverseLLBetweenStartAndEndTest {

  @Test
  public void testReverseLLBetweenStartAndEnd() {
    ListNode head = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
    ReverseLLBetweenStartAndEnd rll = new ReverseLLBetweenStartAndEnd();
    Utils.printLinkedList(head);
    Utils.printLinkedList(rll.reverseBetween(head, 2, 3));
  }

  @Test
  public void testReverseLLBetweenStartAndEnd2() {
    ListNode head = new ListNode(9, new ListNode(10, null));
    new ReverseLLBetweenStartAndEnd().reverseBetween(head, 1, 2);
  }

  @Test
  public void testReverseLLBetweenStartAndEnd3() {
    ListNode head = new ListNode(1,
        new ListNode(2, new ListNode(3, null)));
    new ReverseLLBetweenStartAndEnd().reverseBetween(head, 1, 3);
  }
}
