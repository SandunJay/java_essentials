package objects_and_api.collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("orange");

        var i =fruits.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
