package linkedList;

public class InsertNode {
    static Node insertNode(Node head, int val, int k){
        if(head == null){ return new Node(val); }
        if(k == 1){return new Node(val, head);}
        Node temp = head;
        int count = 0;
        Node prev = null;
        while(temp.next != null){
            count++;
            if(count == k){
                prev.next = temp;
                temp.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
    static Node insertTail(Node head, int val){
        if(head == null){
            return new Node(val);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }
    static  Node insertHead(Node head, int val){
        return new Node(val, head);
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
    private static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = arrayToLL(arr);
        head = insertHead(head, 2);
        head = insertTail(head, 7);
        print(head);
    }
}
