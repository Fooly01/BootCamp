package Aufgaben.Woche1.Collections;

public class NullTreeSetMain {
    public static void main(String[] args) {
        NullTreeSet<String> nullTreeSet = new NullTreeSet<>();

        nullTreeSet.add("Abra");
        nullTreeSet.add("ka");
        nullTreeSet.add(null);
        nullTreeSet.add("dabra");
        nullTreeSet.add(null);
        nullTreeSet.add("Abra");

        System.out.println("Size should be 4 and is: " + nullTreeSet.size()); // 4

        System.out.println("Should be true and is: " + nullTreeSet.contains(null)); // true
        System.out.println("Should be true and is: " + nullTreeSet.contains("Abra")); // true
        System.out.println("Should be false and is: " + nullTreeSet.contains("Sim")); // false

        System.out.println("Should be true and is: " + nullTreeSet.remove(null)); //true
        System.out.println("Should be false and is: " + nullTreeSet.remove(null)); // false
        System.out.println("Should be false and is: " + nullTreeSet.remove("Sim")); // false
        System.out.println("Should be true and is: " + nullTreeSet.remove("Abra")); // true

        System.out.println("Size should be 2 and ist: " + nullTreeSet.size()); // 2
    }
}
