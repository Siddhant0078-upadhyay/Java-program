class Node{
    int data;
    Node next;
    Node(int x){
        data =x;
        next=null;
    }
}
public class Linked_List {
  static Node insertbegin(Node head,int x){
    Node temp = new Node(x);
    temp.next=head;
    return temp;
  }  
  static Node insertend(Node head, int x){
    Node temp = new Node(x);
    if(head == null)
        return temp;
    Node curr=head;
    while(curr.next!=null){
        curr = curr.next;
    }
    curr.next=temp;
    return head;
  }
  static Node insertatindex(Node head,int pos, int x){
    Node temp = new Node(x);
    if(pos==1)
        return temp;
    Node curr =head;
    for(int i=1; i<=pos-2 && curr!=null;i++){
       curr=curr.next;
    }
    if(curr ==  null)
        return head;
    temp.next =curr.next;
    curr.next= temp;
    return head;
  }
  static void printlist(Node head){
    Node curr = head;
    int i=1;
    while(curr!=null){
    System.out.println("Element at postion "+i+"= "+curr.data);
    curr=curr.next;
    i++;
  }}
  public static void main(String[] args){
    System.out.print("Enter the element at head position= ");
    java.util.Scanner sc = new java.util.Scanner(System.in);
    int n=sc.nextInt();
    Node head =new Node(n);
    System.out.print("Enter the number of element you want to enter = ");
    int m=sc.nextInt();
    Node curr =head;
     for(int i=1;i<m;i++){
        System.out.print("Enter the value of temp"+i+" =");
     int val =sc.nextInt();
     Node tempi=new Node(val);
     curr.next=tempi;
     curr=tempi;

    }
    System.out.println("BEfore doing changes in linked list :");
    printlist(head);
    System.out.println("After doing changes in linked list :");
    head=insertbegin(head,40);
    head=insertend(head,78);
    head = insertatindex(head,4,65);
    printlist(head);
    sc.next();
  }
}
