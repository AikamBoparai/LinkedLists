import java.util.HashSet;

public class RemoveDups {
    public static void removeDuplicates(Node n){
        //O(n) time
        //O(n) space
        HashSet<Integer> buffer = new HashSet<>();
        Node prev = null;
        while(n != null){
            if(buffer.contains(n.data)){
                prev.next = n.next;
            }
            else{
                buffer.add(n.data);
                prev = n;
            }
            n = n.next;
        }
    }
    public static void removeDuplicates2(Node n){
        Node current = n;
        while(current != null){
            Node runner = current;
            while(runner.next != null){
                if(current.data == runner.next.data){
                    runner.next = runner.next.next;
                }
                else{
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.appendToTail(2);
        head.appendToTail(1);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(4);
        head.appendToTail(1);
        head.appendToTail(3);
        head.appendToTail(4);
        
        System.out.println("This is our current linked list");
        System.out.println(head.printLinkedList()); 

        System.out.println("This is the list without any duplicates");
        //removeDuplicates(head);
        removeDuplicates2(head);
        System.out.println(head.printLinkedList());

    }
}
