package dsa;

import java.util.Arrays;

public class Q2 {
    
    // Method to get the minimum difference between the heights
    public int getMinDiff(int[] a, int n, int k) {
        // Sort the array to arrange the elements in ascending order
        Arrays.sort(a);
        
        // Initialize min and max values and set the answer as the initial difference
        int max = 0, min = 0;
        int ans = a[n - 1] - a[0];  // Maximum difference in the original array
        int lar = a[n - 1] - k;     // Largest possible value after reducing the largest element by k
        int sml = a[0] + k;         // Smallest possible value after increasing the smallest element by k
        
        // Iterate through the array to adjust heights and minimize the difference
        for (int i = 0; i < n - 1; i++) {
            min = Math.min(sml, a[i + 1] - k);  // Compare the new minimum
            max = Math.max(lar, a[i] + k);      // Compare the new maximum
            
            // Ignore if the minimum height goes below zero (not valid in this context)
            if (min < 0) continue;
            
            // Update the answer with the minimum possible difference
            ans = Math.min(ans, max - min);
        }
        return ans;  // Return the minimum difference
    }

    // Main method to test the getMinDiff() function
    public static void main(String[] args) {
        Q2 solution = new Q2();

        // Example input
        int[] arr = {1, 15, 10};  // Array of heights
        int n = arr.length;       // Size of the array
        int k = 6;                // Value of k to add or subtract from heights

        // Call the method and print the result
        int result = solution.getMinDiff(arr, n, k);
        System.out.println("The minimum difference is: " + result);
    }
}

