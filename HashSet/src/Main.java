import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java Collection Framework!");
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Name1");
        stringHashSet.add("Name2");
        stringHashSet.add("Name3");
        stringHashSet.add("Name1");

        stringHashSet.forEach((n) -> System.out.println(n));
    }
}

/**
 * stores the elements by using a mechanism called hashing
 * contains unique elements only
 * allows null value
 * non synchronized
 * best approach for search operations
 */