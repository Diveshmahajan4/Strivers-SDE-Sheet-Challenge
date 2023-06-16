package LinkedList;
// https://leetcode.com/problems/reverse-linked-list/
public class Reverse {
    public static void main(String[] args) {
        ListNode third = new ListNode(20);
        ListNode sec = new ListNode(40, third);
        ListNode head = new ListNode(60, sec);

        printList(head);
        ListNode temp = reverseList(head);
        printList(temp);
    }

    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }

}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
