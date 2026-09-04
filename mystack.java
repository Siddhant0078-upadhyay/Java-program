import java.util.*;

public class mystack {
    public static void main(String[] args){
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(20);
        s.push(30);
        s.push(50);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
    
}
