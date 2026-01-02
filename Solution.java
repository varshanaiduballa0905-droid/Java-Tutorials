import java.util.Scanner;

public class Solution {

    // Method to check even or odd
    public static int isEven(int input) {
        if (input % 2 == 0) {
            return 2;   // EVEN (includes zero)
        } else {
            return 1;   // ODD
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input
        int input = sc.nextInt();

        // Call function
        int result = isEven(input);

        // Print output
        System.out.println(result);

        sc.close();
    }
}
