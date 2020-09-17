public class SumLists {
    public static Node reverseOrder(Node head1, Node head2) {
        int exp = 0;
        int num1 = 0;
        int num2 = 0;
        while(head1 != null){
            num1 += head1.data * Math.pow(10, exp);
            exp++;
            head1 = head1.next;
        }
        exp = 0;
        while(head2 != null){
            num2 += head2.data * Math.pow(10, exp);
            exp++;
            head2 = head2.next;
        }
        String total = String.valueOf(num1 + num2);
        Node result = new Node(total.charAt(0) - '0');
        for(int i = 1; i < total.length(); i++){
            result.appendToTail(total.charAt(i) - '0');
        }
        return result;
    }
    public static Node forwardOrder(Node head1, Node head2) {
        int counter = 0;
        int exp = -1;
        int sum1 = 0;
        int sum2 = 0;
        double sumD = 0.0;

        while(head1 != null){
            sumD += head1.data * Math.pow(10, exp);
            exp--;
            counter++;
            head1 = head1.next;
        }
        sumD = sumD * Math.pow(10, counter);
        sum1 = (int)sumD;
        exp = -1;
        counter = 0;
        sumD = 0.0;
        while(head2 != null){
            sumD += head2.data * Math.pow(10, exp);
            exp--;
            counter++;
            head2 = head2.next;
        }
        sumD = sumD * Math.pow(10, counter);
        sum2 = (int)sumD;
        String total = String.valueOf(sum1 + sum2);
        Node result = new Node(total.charAt(0) - '0');
        for(int i = 1; i < total.length(); i++){
            result.appendToTail(total.charAt(i) - '0');
        }
        return result;
    }
    public static void main(String[] args) {
        //First number is 617 in reverse order
        Node head1 = new Node(7);
        head1.appendToTail(1);
        head1.appendToTail(6);

        //Second number is 295 in reverser order
        Node head2 = new Node(5);
        head2.appendToTail(9);
        head2.appendToTail(2);

        System.out.println(reverseOrder(head1, head2).printLinkedList());

        //First number is 617 in forward order
        Node head3 = new Node(6);
        head3.appendToTail(1);
        head3.appendToTail(7);

        //Second number is 295 in forward order
        Node head4 = new Node(2);
        head4.appendToTail(9);
        head4.appendToTail(5);

        System.out.println(forwardOrder(head3, head4).printLinkedList());
    }
}
