public class Partition {
    public static Node partitionNode(Node head, int x) {
        //O(n) time
        //O(1) space
        Node result = new Node(head.data);
        head = head.next;
        while(head != null){
            if(head.data < x){
                Node tail = result;
                result = new Node(head.data);
                result.next = tail;
            }
            else{
                Node tail = result.next;
                result.next = new Node(head.data);
                result.next.next = tail;
            }
            head = head.next;
        }
        return result;
    }
    public static void main(String[] args) {
        Node head = new Node(3);
        head.appendToTail(5);
        head.appendToTail(8);
        head.appendToTail(5);
        head.appendToTail(10);
        head.appendToTail(2);
        head.appendToTail(1);

        System.out.println(head.printLinkedList());
        System.out.println(partitionNode(head, 5).printLinkedList());
    }
    
}
