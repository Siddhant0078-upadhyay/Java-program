import java.util.*;
public class MyDeque {
  public static void main(String[] args){
    Deque <Integer> d=new ArrayDeque<Integer>();
     d.offerLast(45);
    d.offerFirst(40);
    d.offerFirst(90);
    d.offerFirst(402);
    d.offerFirst(36);
     d.offerLast(21); 
     d.offerLast(19);
     System.out.println(d.peekFirst());
     System.out.println(d.peekLast());
     System.out.println(d.pollFirst());
     System.out.println(d.pollLast());
     System.out.println(d.peekLast());
  }  
}
