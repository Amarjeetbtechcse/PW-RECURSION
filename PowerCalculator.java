import java.util.Scanner;

public class PowerCalculator {

    public static int pow(int a, int b) {
        if (b == 0) return 1; // Base case: a^0 = 1
        int halfPower = pow(a, b / 2); // Recursive call for half the power
        if (b % 2 == 0) {
            return halfPower * halfPower; // If b is even
        } else {
            return halfPower * halfPower * a; // If b is odd
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        int result = pow(a, b); // Store the result of the power calculation
        System.out.println(a + " to the power " + b + " is: " + result); // Print the result
        sc.close(); // Close the scanner to avoid resource leaks
    }
}
