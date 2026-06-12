//import java.lang.reflect.Array;
import java.util.*;
public class ArrayListDemo {
    public static void main (String[] args){
        ArrayList<Integer> l1 = new ArrayList<>(); 
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(8);
        l1.add(14);
        l1.add(64);
        l1.add(9);
        l2.add(611);
        l2.add(36);
        l2.add(7);
        l2.add(99);
        l1.addAll(0,l2);
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
    
}
