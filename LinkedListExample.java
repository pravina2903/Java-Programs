import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        System.out.println("Cities: " + cities);

        System.out.println("First city: " + cities.getFirst());
        System.out.println("Last city: " + cities.getLast());

        cities.addFirst("Paris");
        cities.addLast("India");
        System.out.println("Updated Cities: " + cities);

        cities.remove("London");
        System.out.println("After removal: " + cities);

        System.out.println("All cities:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
