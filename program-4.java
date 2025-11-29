import java.util.*;  // Importing utility classes including Map and HashMap

class Main{
    public static void main(String[] args) {

        // Array containing the given numbers
        int[] nums = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // HashMap to store: divisor → count of numbers divisible by that divisor
        Map<Integer, Integer> result = new HashMap<>();

        // Loop from 1 to 9 to check divisibility for each number
        for (int i = 1; i <= 9; i++) {

            int count = 0;  // Count how many numbers in the array are divisible by i

            // Loop through each number in the array
            for (int n : nums) {

                // Check if current number is divisible by i
                if (n % i == 0) {
                    count++;
                }
            }

            // Store the divisor (i) and the count of divisible numbers in the map
            result.put(i, count);
        }

        // Print the final map containing results
        System.out.println(result);
    }
}

