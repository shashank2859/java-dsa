package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Delete_Head_Last{
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
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    private static Node deleteHead(Node head){
        if(head==null) return head;
        head=head.next;
        return head;

    }
    private static Node deleteLast(Node head){
        if(head==null||head.next==null) return null;

        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        Node head=convert2Array(arr);
        head=deleteLast(head);
        print(head);
    }
}
