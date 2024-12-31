package linkedList;

public class LengthOfLL {
    static int lengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    static Node arrToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
      return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = arrToLL(arr);
        System.out.println(lengthOfLL(head));
    }
}


