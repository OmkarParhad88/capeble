
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
  int data;
  TreeNode left;
  TreeNode right;

  public TreeNode(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

public class binaryTree {

  // Recursive Traversals

  // Preorder Traversal (Root, Left, Right)
  public static void recursivePreorder(TreeNode root) {
    if (root != null) {
      System.out.print(root.data + " ");
      recursivePreorder(root.left);
      recursivePreorder(root.right);
    }
  }

  // Inorder Traversal (Left, Root, Right)
  public static void recursiveInorder(TreeNode root) {
    if (root != null) {
      recursiveInorder(root.left);
      System.out.print(root.data + " ");
      recursiveInorder(root.right);
    }
  }

  // Postorder Traversal (Left, Right, Root)
  public static void recursivePostorder(TreeNode root) {
    if (root != null) {
      recursivePostorder(root.left);
      recursivePostorder(root.right);
      System.out.print(root.data + " ");
    }
  }

  // Level Order Traversal (BFS)
  public static void recursiveLevelOrder(TreeNode root) {
    int height = getHeight(root);
    for (int i = 1; i <= height; i++) {
      printGivenLevel(root, i);
    }
  }

  private static void printGivenLevel(TreeNode root, int level) {
    if (root == null) {
      return;
    }
    if (level == 1) {
      System.out.print(root.data + " ");
    } else if (level > 1) {
      printGivenLevel(root.left, level - 1);
      printGivenLevel(root.right, level - 1);
    }
  }

  private static int getHeight(TreeNode root) {
    if (root == null) {
      return 0;
    } else {
      int leftHeight = getHeight(root.left);
      int rightHeight = getHeight(root.right);
      return Math.max(leftHeight, rightHeight) + 1;
    }
  }

  // Iterative Traversals

  // Preorder Traversal (Root, Left, Right)
  public static void iterativePreorder(TreeNode root) {
    if (root == null) {
      return;
    }

    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()) {
      TreeNode current = stack.pop();
      System.out.print(current.data + " ");

      if (current.right != null) {
        stack.push(current.right);
      }
      if (current.left != null) {
        stack.push(current.left);
      }
    }
  }

  // Inorder Traversal (Left, Root, Right)
  public static void iterativeInorder(TreeNode root) {
    if (root == null) {
      return;
    }

    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;

    while (current != null || !stack.isEmpty()) {
      while (current != null) {
        stack.push(current);
        current = current.left;
      }

      current = stack.pop();
      System.out.print(current.data + " ");
      current = current.right;
    }
  }

  // Postorder Traversal (Left, Right, Root)
  public static void iterativePostorder(TreeNode root) {
    if (root == null) {
      return;
    }

    Stack<TreeNode> stack1 = new Stack<>();
    Stack<TreeNode> stack2 = new Stack<>();
    stack1.push(root);

    while (!stack1.isEmpty()) {
      TreeNode current = stack1.pop();
      stack2.push(current);

      if (current.left != null) {
        stack1.push(current.left);
      }
      if (current.right != null) {
        stack1.push(current.right);
      }
    }

    while (!stack2.isEmpty()) {
      System.out.print(stack2.pop().data + " ");
    }
  }

  // Level Order Traversal (BFS)
  public static void iterativeLevelOrder(TreeNode root) {
    if (root == null) {
      return;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      TreeNode current = queue.poll();
      System.out.print(current.data + " ");

      if (current.left != null) {
        queue.add(current.left);
      }
      if (current.right != null) {
        queue.add(current.right);
      }
    }
  }

  public static void main(String[] args) {
    /*
     * 1
     * / \
     * 2 3
     * / \
     * 4 5
     */

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);

    System.out.println("Recursive Preorder: ");
    recursivePreorder(root);
    System.out.println("\nIterative Preorder: ");
    iterativePreorder(root);

    System.out.println("\n\nRecursive Inorder: ");
    recursiveInorder(root);
    System.out.println("\nIterative Inorder: ");
    iterativeInorder(root);

    System.out.println("\n\nRecursive Postorder: ");
    recursivePostorder(root);
    System.out.println("\nIterative Postorder: ");
    iterativePostorder(root);

    System.out.println("\n\nRecursive Level Order: ");
    recursiveLevelOrder(root);
    System.out.println("\nIterative Level Order: ");
    iterativeLevelOrder(root);
  }
}
