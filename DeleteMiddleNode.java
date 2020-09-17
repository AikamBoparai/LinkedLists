public class DeleteMiddleNode {
    public static Node uniqueList(int n) {
        Node head = new Node(0);
        for(int i = 1; i <= n; i++){
            head.appendToTail(i);
        }
        return head;
    }
    //Note for this problem we are not given access to the head, we are only given access to the node to be deleted
    public static void deleteMiddle(Node middle) {
        middle.data = middle.next.data;
        middle.next = middle.next.next;
    }
    public static void main(String[] args) {
        Node head = uniqueList(10);
        deleteMiddle(head.next.next.next); //will remove the 3rd number
        System.out.println(head.printLinkedList());
    }
}
