package ListOperationsDemo;


	import java.util.*;

	public class ListOperationsDemo {

	    public static void main(String[] args) {
	        List<String> arrayList = new ArrayList<>();
	        List<String> linkedList = new LinkedList<>();

	        System.out.println("=== ArrayList Operations ===");
	        performOperations(arrayList);

	        System.out.println("\n=== LinkedList Operations ===");
	        performOperations(linkedList);
	    }

	    static void performOperations(List<String> list) {
	        // 1. Adding elements
	        addElements(list);
	        printList("After adding elements", list);

	        // 2. Adding element at specific index
	        addElementAtIndex(list, 1, "Grapes");
	        printList("After adding 'Grapes' at index 1", list);

	        // 3. Adding multiple elements
	        addMultipleElements(list, Arrays.asList("Mango", "Pineapple"));
	        printList("After adding multiple elements", list);

	        // 4. Accessing elements
	        accessElement(list, 2);

	        // 5. Updating elements
	        updateElement(list, 0, "Kiwi");
	        printList("After updating index 0 to 'Kiwi'", list);

	        // 6. Removing elements
	        removeElement(list, "Banana");
	        printList("After removing 'Banana'", list);

	        // 7. Searching elements
	        searchElement(list, "Orange");

	        // 8. List size
	        getSize(list);

	        // 9. Iterating over list
	        iterateList(list);

	        // 10. Using Iterator
	        iterateWithIterator(list);

	        // 11. Sorting
	        sortList(list);
	        printList("After sorting", list);

	        // 12. Sublist
	        createSubList(list, 1, 3);

	        // 13. Clearing the list
	        clearList(list);
	        printList("After clearing", list);
	    }

	    // Function implementations
	    static void addElements(List<String> list) {
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Orange");
	    }

	    static void addElementAtIndex(List<String> list, int index, String element) {
	        list.add(index, element);
	    }

	    static void addMultipleElements(List<String> list, List<String> elements) {
	        list.addAll(elements);
	    }

	    static void accessElement(List<String> list, int index) {
	        if (index < list.size()) {
	            System.out.println("Element at index " + index + ": " + list.get(index));
	        } else {
	            System.out.println("Index " + index + " out of bounds");
	        }
	    }

	    static void updateElement(List<String> list, int index, String newValue) {
	        if (index < list.size()) {
	            list.set(index, newValue);
	        }
	    }

	    static void removeElement(List<String> list, String element) {
	        list.remove(element);
	    }

	    static void searchElement(List<String> list, String element) {
	        if (list.contains(element)) {
	            System.out.println("Element '" + element + "' found at index: " + list.indexOf(element));
	        } else {
	            System.out.println("Element '" + element + "' not found.");
	        }
	    }

	    static void getSize(List<String> list) {
	        System.out.println("List size: " + list.size());
	    }

	    static void iterateList(List<String> list) {
	        System.out.println("Iterating using for-each loop:");
	        for (String item : list) {
	            System.out.println(item);
	        }
	    }

	    static void iterateWithIterator(List<String> list) {
	        System.out.println("Iterating using Iterator:");
	        Iterator<String> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }

	    static void sortList(List<String> list) {
	        Collections.sort(list);
	    }

	    static void createSubList(List<String> list, int from, int to) {
	        if (from < list.size() && to <= list.size()) {
	            List<String> subList = list.subList(from, to);
	            System.out.println("Sublist from index " + from + " to " + (to - 1) + ": " + subList);
	        } else {
	            System.out.println("Invalid sublist range.");
	        }
	    }

	    static void clearList(List<String> list) {
	        list.clear();
	    }

	    static void printList(String message, List<String> list) {
	        System.out.println(message + ": " + list);
	    }
	}
