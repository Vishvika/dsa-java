package linkedList;

class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}

class ArrayToLL {
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

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node ans = arrayToLL(arr);
        while(ans != null){
            System.out.print(ans.data + " ");
            ans  = ans.next;
        }
        System.out.println();
    }
}

