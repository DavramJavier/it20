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

         