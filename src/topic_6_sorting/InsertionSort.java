package topic_6_sorting;  // Declares the package for the class

import java.util.ArrayList;  // Imports the ArrayList class for storing numbers
import java.util.Scanner;  // Imports the Scanner class for taking user input

public class InsertionSort {  // Main class InsertionSort

    // Method that implements the Insertion Sort algorithm
    public static void insertionSort(ArrayList<Integer> arr) {
        int n = arr.size();  // Gets the size of the ArrayList
        // Loop through the list starting from the second element
        for (int i = 1; i < n; i++) {
            int key = arr.get(i);  // Stores the current element (key) to be inserted
            int j = i - 1;  // The index of the element just before the key

            // Move elements of arr[0..i-1] that are greater than key one position ahead
            // to make space for the key
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));  // Shift the larger element to the right
                j = j - 1;  // Move to the next element
            }
            arr.set(j + 1, key);  // Place the key in the correct position
        }
    }
