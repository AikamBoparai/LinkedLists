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
    void appendToTail(Node n){
        Node current = this;
        while(current.next != null){
            current = current.next;
        }
        current.next = n;
    }
    int size(){
        Node n = this;
        int counter = 0;
        while(n != null){
            counter++;
            n = n.next;
        }
        return counter;
    }
    Node getTail(){
        Node n = this;
        while(n.next != null){
            n =  n.next;
        }
        return n;
    }
    Node getKthElement(int k){
        Node n = this;
        for(int i = 0 ; i < k; i++){
            n = n.next;
        }
        return n;
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
    void printCycle(){
        //THIS METHOD IS FOR DEBUG PURPOSES ONLY
        Node n = this;
        int counter = 0; //this will be arbitrary assuming the list size is less than 30
        while(counter < 30){
            System.out.print(n.data + " ");
            n = n.next;
            counter++;
        }
    }
}
