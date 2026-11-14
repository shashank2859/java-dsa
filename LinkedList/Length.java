package LinkedList;
    class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Length {
    public static Node convert2Array(int []arr){
        Node head= new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
        
    }
    static int length0fAll(Node head){
        int count=0;
        
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,9,8};
        Node head=convert2Array(arr);
        System.out.print(length0fAll(head));
        
    }
}

