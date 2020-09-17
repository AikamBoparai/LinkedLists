public class Node{
    Node next = null;
    int data;

    public Node(int d){
        data = d;
    }

    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next != null){
            n = n.next;
        }
        n.next = end;
    }
    String printLinkedList(){
        Node n = this;
        StringBuilder result = new StringBuilder();
        while(n.next != null){
           result.append(n.data + ", ");
           n = n.next;
        }
        result.append(n.data);
        return result.toString();
    }
}
