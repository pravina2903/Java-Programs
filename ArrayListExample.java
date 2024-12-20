import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Fruits: " + fruits);

         System.out.println("First fruit: " + fruits.get(0));

        fruits.set(1, "Blueberry");
        System.out.println("Updated Fruits: " + fruits);

        fruits.remove("Cherry");
        System.out.println("After removal: " + fruits);

        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

