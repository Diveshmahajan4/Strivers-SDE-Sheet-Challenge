package Trees;

import java.util.LinkedList;
// https://leetcode.com/problems/maximum-width-of-binary-tree/
public class WidthOfBT {
    static class Pair {
        Node node;
        int state;
        Pair (Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public int widthOfBinaryTree(Node root) {
        if (root == null) {
            return 0;
        }
        //  priority Queue (complete binary tree property)
        //  assigning indexes as we assign indexes in the implementatiaon of PriorityQueue
        LinkedList<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int maxWidth = 0;

        while (q.size() != 0) {
            int size = q.size();
            maxWidth = Math.max(maxWidth, Math.abs(q.peekFirst().state - q.peekLast().state) + 1);
            while (size-- > 0) {
                Pair rem = q.removeLast();
                if (rem.node.left != null) {
                    q.addFirst(new Pair(rem.node.left, 2 * rem.state + 1));
                }
                if (rem.node.right != null) {
                    q.addFirst(new Pair(rem.node.right, 2 * rem.state + 2));
                }
            }
        }
        return maxWidth;
    }
}
