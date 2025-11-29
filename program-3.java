import java.util.*;   // Importing the utility package to use the Scanner class

class Main{
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);  // Scanner to take input from user
        int a = sc.nextInt();                 // Read an integer value from user

        // If 'a' is even, reduce it by 1 to make it odd.
        // If 'a' is already odd, use 'a' as it is.
        // This ensures we print odd numbers only up to the nearest odd count.
        int count = (a % 2 == 0) ? a - 1 : a;

        // Loop runs from 1 to 'count' to print odd numbers
        for (int i = 1; i <= count; i++) {
            // Formula to generate ith odd number: 2*i - 1
            System.out.print((2 * i - 1) + " ");
        }
    }
}

