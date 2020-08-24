package CT_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();

        list.add("Rajesh");
//        list.add(34);
        list.add("Apzal");
        list.add("Santhosh");
        list.add("Aparna");

        System.out.println("number of values: " + list.size()) ;
        System.out.println("Second value " + list.get(1)) ;
        System.out.println("Apzal Exists:" + list.contains("RajeshKrishnan"));
        System.out.println("Apzal location index:" + list.indexOf("Apzal"));
System.out.println("############################################################################");
        list.remove("Apzal");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println(value);
        }


    }
}
