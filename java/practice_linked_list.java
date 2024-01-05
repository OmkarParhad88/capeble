class Node {
  int data;
  Node next;

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

public class practice_linked_list {

  // Function to reverse a linked list using recursion
  private static Node reverseListRecursively(Node head) {
    if (head == null || head.next == null) {
      return head;
    }

    Node restReversed = reverseListRecursively(head.next);
    head.next.next = head;
    head.next = null;

    return restReversed;
  }

  // Function to reverse a linked list using iteration
  private static Node reverseListIteratively(Node head) {
    Node prev = null;
    Node current = head;
    Node next;

    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    return prev;
  }

  // Function to detect and find the starting point of a loop in a linked list
  private static Node detectAndFindLoopStart(Node head) {
    Node slow = head;
    Node fast = head;

    // Detect the loop
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        break;
      }
    }

    // If there is no loop
    if (fast == null || fast.next == null) {
      return null;
    }

    // Find the starting point of the loop
    slow = head;
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }

    return slow;
  }

  public static void main(String[] args) {
    // Create a sample linked list with a loop
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);
    head.next.next.next.next.next = head.next; // creating a loop

    // Reverse the linked list using recursion
    head = reverseListRecursively(head);
    System.out.println("Reversed List (Recursively):");
    printList(head);

    // Reverse the linked list using iteration
    head = reverseListIteratively(head);
    System.out.println("\nReversed List (Iteratively):");
    printList(head);

    // Detect and find the starting point of the loop
    Node loopStart = detectAndFindLoopStart(head);
    if (loopStart != null) {
      System.out.println("\nLoop detected. Starting point of the loop: " + loopStart.data);
    } else {
      System.out.println("\nNo loop detected.");
    }
  }

  // Function to print the linked list
  private static void printList(Node head) {
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }
}
