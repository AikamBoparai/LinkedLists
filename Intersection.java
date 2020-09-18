public class Intersection {
    
    public static Node intersectionNode(Node head1, Node head2) {
        //If lists are of different sizes we need to adjust them
        //loop the lists to find the size and chekc the tails

        Node longList = head1.size() >= head2.size() ? head1 : head2;
        Node shortList = head1.size() >= head2.size() ? head2 : head1;

        if(head1.getTail() != head2.getTail()){
            return new Node(-1);
        }

        //adjust the longer list so we can iterate at a constant rate
        Node result = null;
        Node cutLong = longList.getKthElement(longList.size() - shortList.size());
        while(result == null){
            if(cutLong == shortList){
                result = cutLong;
            }
            cutLong = cutLong.next;
            shortList = shortList.next;
        }
        return result;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.appendToTail(2);
        head1.appendToTail(3);

        Node intersectingNode = new Node(Integer.MAX_VALUE);
        head1.appendToTail(intersectingNode);
        head1.appendToTail(4);
        head1.appendToTail(5);

        Node head2 = new Node(6);
        head2.appendToTail(7);
        head2.appendToTail(intersectingNode);

        System.out.println(head1.printLinkedList());
        System.out.println(head2.printLinkedList());
        System.out.println(intersectionNode(head1, head2).printLinkedList());
    }
}
