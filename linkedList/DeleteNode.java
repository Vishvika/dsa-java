package linkedList;

public class DeleteNode {
    static Node deleteNode(Node head, int key) {
        if(head == null) return head;
        if(key==1){
            Node temp = head;
            head = head.next;
            return head;
        }
        int count =0;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            count++;
            if(count==key){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node arrayToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,2,2,4,5};
        Node head = arrayToLL(arr);
        head = deleteNode(head, 3);
        print(head);


    }
}
