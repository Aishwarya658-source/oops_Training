import java.util.*;

public class Itels {
    public static void main(String[] args) {
        // Create a collection
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        
        // Get an iterator
        Iterator<String> iterator = fruits.iterator();
        
        // Traverse the collection
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}