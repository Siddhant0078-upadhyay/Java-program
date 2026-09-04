import java.util.*;

public class MyHash {
    public static void main(String[] args){
        HashSet<String> h=new HashSet<String>();
        h.add("Krishnajanmastmi");
        h.add("ki");
        h.add("Aap");
        h.add("sabko");
        h.add("Hardik");
        h.add("Subhkamnayein");
        System.out.println(h.size());
        System.out.println(h.contains("Aap"));
        Iterator<String> i= h.iterator();
        while(i.hasNext())
            System.out.println(i.next()+" ");
        h.remove("Hardik");
        System.out.println(h.size()); 
    }
    
}
