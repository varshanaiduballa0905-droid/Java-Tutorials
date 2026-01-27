import java.util.Scanner;

// Functional Interface
interface PerformOperation {
    boolean check(int n);
}

public class LambdaExpression {

    // Lambda for Odd / Even
    static PerformOperation isOdd() {
        return n -> n % 2 != 0;
    }

    // Lambda for Prime
    static PerformOperation isPrime() {
        return n -> {
            if (n <= 1) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };
    }

    // Lambda for Palindrome
    static PerformOperation isPalindrome() {
        return n -> {
            int temp = n, rev = 0;
            while (n > 0) {
                rev = rev * 10 + n % 10;
                n /= 10;
            }
            return temp == rev;
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int choice = sc.nextInt();
            int num = sc.nextInt();

            if (choice == 1) {
                System.out.println(isOdd().check(num) ? "ODD" : "EVEN");
            } 
            else if (choice == 2) {
                System.out.println(isPrime().check(num) ? "PRIME" : "COMPOSITE");
            } 
            else if (choice == 3) {
                System.out.println(isPalindrome().check(num) ? "PALINDROME" : "NOT PALINDROME");
            }
        }
        sc.close();
    }
}


    

