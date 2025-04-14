package linkedList;

public class InsertNode {
    static Node insertNode(Node head, int val, int key){
        if(head==null){return head;}
        if(key==1){
            return new Node(val, head);
        }
        Node temp = head;
        int count = 0;
        while(temp.next!=null){
            count++;
            if(count == key -1){
                Node newNode = new Node(val, temp.next);
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp=temp.next;
        }

        return head;
    }
    static Node insertTail(Node head, int val){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode = new Node(val, null);
        temp.next=newNode;
        return head;
    }
    static Node insertHead(Node head, int val){
        Node temp = new Node(val, head);
        return temp;
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
        head = insertNode(head, 7, 4);
        head = insertTail(head, 7);
        print(head);
    }
}
