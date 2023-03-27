import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java Collection Framework!");
        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.add("Name1");
        stringLinkedList.add("Name2");
        stringLinkedList.add("Name3");
        stringLinkedList.add("Name1");

        stringLinkedList.forEach((n) -> System.out.println(n));
    }
}

/**
 * can contain duplicate elements
 * maintains insertion order
 * non synchronized
 */