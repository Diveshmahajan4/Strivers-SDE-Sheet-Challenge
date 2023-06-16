package LinkedList;
// https://leetcode.com/problems/middle-of-the-linked-list/
public class Middle {
    public void main(String[] args) {
        ListNode third = new ListNode(20);
        ListNode sec = new ListNode(40, third);
        ListNode head = new ListNode(60, sec);

        printList(head);
    }

    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}


