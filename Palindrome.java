import java.util.Stack;

public class Palindrome {
    public static Node reverseList(Node head) {
        Node result = null;
        while(head != null){
            Node tail = result;
            result = new Node(head.data);
            result.next = tail;
            head = head.next;
        }
        return result;
    }
    public static Boolean isPalindromeReverse(Node head) {
        Node result = reverseList(head);
        while(head != null){
            if(head.data != result.data){
                return false;
            }
            head = head.next;
            result = result.next;
        }
        return true;
    }
    //saw a cool solution in the book using a stack
    public static Boolean isPalindromeStack(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast != null){
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        while(slow != null){
            int top = stack.pop();
            if(top != slow.data){
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);
        head.appendToTail(4);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(1);
        System.out.println(isPalindromeStack(head));
    }
}
