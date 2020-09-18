public class Cycle {

    public static Node getLoop(Node head) {
        //we should use two pointers to detect the loop
        Node slow = head;
        Node fast = head;

        do{
            if(fast.next == null){
                return null;
                //if there isn't a looop
            }
            slow = slow.next;
            fast = fast.next.next;
        }while(fast != slow);

        /*Let n represent the number of nodes before the loop
        when slow reaches the loop it will be size(loop) - n away from catching up
        since it fast moves 1 more it should catch the slow pointer in n steps
        when they collide they will be n steps away from the beginning of the loop
        */

        //set slow to the beginning of the list and change rate of fast to be slow
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;

    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(3);

        //create a loop node so we can reference it 
        Node loop = new Node(4);
        head.appendToTail(loop);

        head.appendToTail(5);
        head.appendToTail(6);
        head.appendToTail(7);
        head.appendToTail(8);
        head.appendToTail(9);

        //create loop
        head.getTail().next = loop;

        getLoop(head).printCycle();
    }
}
