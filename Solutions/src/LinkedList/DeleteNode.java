package LinkedList;
// https://leetcode.com/problems/delete-node-in-a-linked-list/
public class DeleteNode {
    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        if(node == null){
            return;
        }
        // Swap
        int temp = node.val;
        node.val = node.next.val;
        node.next.val = temp;

        // delete
        node.next = node.next.next;
    }
}
