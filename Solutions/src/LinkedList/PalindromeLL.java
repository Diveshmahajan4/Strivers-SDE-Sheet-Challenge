package LinkedList;
// https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLL {
    public static void main(String[] args) {

    }

    public ListNode middleNode(ListNode head){
        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public ListNode reverseList(ListNode head) {
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

    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode reverseHead = headSecond;

        // compare both the halves
        while(head != null && headSecond != null){
            if(head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(reverseHead);
        return head == null || headSecond == null;
    }
}
