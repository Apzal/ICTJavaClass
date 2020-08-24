package CT_Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

    public static void main(String[] args) {

        Set<String> hset = new TreeSet<String>();

        hset.add("Zubair");
        hset.add("Rajesh");
//        list.add(34);
        hset.add("Apzal");
        hset.add("Santhosh");
        hset.add("Aparna");
        hset.add("Rajesh");

        System.out.println("number of values: " + hset.size()) ;
//        System.out.println("Second value " + list.get(1)) ;
        System.out.println("Apzal Exists:" + hset.contains("RajeshKrishnan"));
//        System.out.println("Apzal location index:" + list.indexOf("Apzal"));
System.out.println("############################################################################");
        hset.remove("Apzal");

        Iterator<String> it = hset.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println(value);
        }


    }
}
