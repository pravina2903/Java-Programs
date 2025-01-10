import java.util.*;

public class SwappingTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Before swapping: num1 = " + a + ", num2 = " + b);

        // Swapping logic: without a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: num1 = " + a + ", num2 = " + b);
    }
}
