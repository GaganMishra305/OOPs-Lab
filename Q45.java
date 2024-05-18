import java.util.HashSet;
import java.util.TreeSet;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q45 {
    public static void main(String[] args) {
        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        System.out.println("HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
        hashSet.remove("Banana");
        System.out.println("Contains 'Apple': " + hashSet.contains("Apple"));

        // TreeSet
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        System.out.println("\nTreeSet:");
        Iterator<String> treeIterator = treeSet.iterator();
        while (treeIterator.hasNext()) {
            System.out.println(treeIterator.next());
        }
        treeSet.remove("Banana");
        System.out.println("Contains 'Apple': " + treeSet.contains("Apple"));

        // Hashtable
        Hashtable<Integer, String> hashTable = new Hashtable<>();
        hashTable.put(1, "One");
        hashTable.put(2, "Two");
        hashTable.put(3, "Three");
        System.out.println("\nHashtable:");
        for (Map.Entry<Integer, String> entry : hashTable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        hashTable.put(2, "New Two");
        hashTable.remove(3);
        System.out.println("Contains key 1: " + hashTable.containsKey(1));
        System.out.println("Contains value 'Two': " + hashTable.containsValue("Two"));

        // HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("\nHashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        hashMap.put(2, "New Two");
        hashMap.remove(3);
        System.out.println("Contains key 1: " + hashMap.containsKey(1));
        System.out.println("Contains value 'Two': " + hashMap.containsValue("Two"));
    }
}
