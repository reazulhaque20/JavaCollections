import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java Collection Framework!");
        List<String> stringList = new ArrayList<>();
        stringList.add("Name1");
        stringList.add("Name2");
        stringList.add("Name3");

        stringList.forEach((n)->System.out.println(n));
    }
}

/**
 * duplicate element of different data types
 * maintains the insertion order
 * non-synchronized
 * can be randomly accessed
 */