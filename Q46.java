import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Iterator;

public class Q46 {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        // Creation and insertion
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList:");
        // Iteration
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        // Updating
        arrayList.set(1, "New Banana");
        System.out.println("Updated ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        // Deletion
        arrayList.remove("Orange");
        System.out.println("ArrayList after deletion:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        
        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        // Creation and insertion
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        System.out.println("\nLinkedList:");
        // Iteration
        Iterator<String> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }
        // Updating
        linkedList.set(1, "New Banana");
        System.out.println("Updated LinkedList:");
        linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }
        // Deletion
        linkedList.remove("Orange");
        System.out.println("LinkedList after deletion:");
        linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }
        
        // Vector
        Vector<String> vector = new Vector<>();
        // Creation and insertion
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("\nVector:");
        // Iteration
        for (String fruit : vector) {
            System.out.println(fruit);
        }
        // Updating
        vector.set(1, "New Banana");
        System.out.println("Updated Vector:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }
        // Deletion
        vector.remove("Orange");
        System.out.println("Vector after deletion:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }
    }
}

