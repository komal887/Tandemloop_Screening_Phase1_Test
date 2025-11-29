import java.util.*;   // Importing the utility package to use the Scanner class

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creating Scanner object to take user input
        
        int a = sc.nextInt();  // Reading an integer input from the user

        // Loop runs from 1 to 'a' to generate first 'a' odd numbers
        for (int i = 1; i <= a; i++) {

            // Formula for the ith odd number: (2 * i - 1)
            System.out.print((2 * i - 1) + " ");
        }
    }
}
