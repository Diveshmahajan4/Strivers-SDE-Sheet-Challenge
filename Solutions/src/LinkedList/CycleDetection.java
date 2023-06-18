package LinkedList;
// https://leetcode.com/problems/linked-list-cycle/
public class CycleDetection {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
