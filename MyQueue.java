import java.util.ArrayDeque;
import java.util.Queue;
public class MyQueue {
    public static void main(String[] args){
        Queue <Integer> q= new ArrayDeque<Integer>();
        q.offer(40);
        q.offer(90);
        q.offer(20);
        q.add(240);
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.element());
        System.out.println(q.isEmpty());
    }
    
}
