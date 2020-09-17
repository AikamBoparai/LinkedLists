public class ReturnKthToLast {
    public static Node uniqueList(int n) {
        Node head = new Node(0);
        for(int i = 1; i <= n; i++){
            head.appendToTail(i);
        }
        return head;
    }
    public static Node kthToLast(Node head, int k){
        //O(n) time
        //O(1) space
        Node left = head;
        Node right = head;
        for(int i = 0; i < k; i++){
            if(right == null){
                return new Node(Integer.MIN_VALUE);
            }
            right = right.next;
        }
        while(right != null){
            left = left.next;
            right = right.next;
        }
        return left;
        
    }
    public static void main(String[] args) {
        Node head = uniqueList(30);
        System.out.println(head.printLinkedList());
        System.out.println("The last element is " + kthToLast(head, 1).data);
        System.out.println("The second last element is " + kthToLast(head, 2).data); 
        System.out.println("The third last element is " + kthToLast(head, 3).data); 
    }
}
