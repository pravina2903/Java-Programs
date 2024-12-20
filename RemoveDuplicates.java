import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 5, 6};
        
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num);
        }

        System.out.println("Array without duplicates: " + set);
    }
}

