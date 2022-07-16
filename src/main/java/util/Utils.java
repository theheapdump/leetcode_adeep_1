package util;

import ds.lists.ListNode;

public class Utils {

  public static void printLinkedList(ListNode head) {
    System.out.println("\n");
    while (head != null) {
      System.out.print(" -> " + head.val);
      head = head.next;
    }
  }
}
