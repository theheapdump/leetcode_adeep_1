package easy.linked_list;

import ds.lists.ListNode;
import org.junit.jupiter.api.Test;
import util.Utils;

public class ReverseLLTest {

  @Test
  public void testReverseLL() {
    ListNode head = new ListNode(1,
        new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
    Utils.printLinkedList(head);
    head = new ReverseLinkedList().reverseList(head);
    Utils.printLinkedList(head);
  }

  @Test
  public void testReverseLL2() {
    ListNode head = new ListNode(1, null);
    Utils.printLinkedList(head);
    head = new ReverseLinkedList().reverseList(head);
    Utils.printLinkedList(head);
  }
}
