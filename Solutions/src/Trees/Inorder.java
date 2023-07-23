package Trees;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/binary-tree-inorder-traversal/

public class Inorder {
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(Node root) {
        if (root != null){
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }
}

class Node {
      int val;
      Node left;
      Node right;
      Node() {}
      Node(int val) { this.val = val; }
      Node(int val, Node left, Node right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

