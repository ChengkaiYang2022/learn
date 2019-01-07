package Chapter9.Iterator;

import java.util.*;

/**
 * https://docs.oracle.com/javase/7/docs/api/java/util/package-summary.html
 * collection java api
 *
 * https://www.youtube.com/watch?v=b9eg6QLHI0A
 * Iterator loop 解决set list
 */
public class LoopIterator {
    public static void main(String[] args){
        List<String> l = new ArrayList<>();
        l.add("yangchengkai");
        l.add("like");
        l.add("wangkeai");
        print(l);

        Set<String> s = new HashSet<>();
        s.add("yangck hashset");
        s.add("like");
        s.add("www");
        print(l);
    }
    public static void print(List<String> l){
        Iterator<String> it = l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}

