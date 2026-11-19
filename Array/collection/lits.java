package Array.collection;

import java.util.List;
import  java. util.ArrayList;
public class lits {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(23);
        l.add(12);
        l.add(12);
        l.add(null);
        l.add(null);    
         System.out.println(l.removeFirst());
        System.out.println(l);
    }
    
}
