package topic_6_sorting;  // Declares the package for the class

import java.util.Scanner;  // Imports the Scanner class for taking user input
import java.util.ArrayList;  // Imports the ArrayList class to store numbers

public class BubbleSort {  // Main class BubbleSort

    // Method that implements the Bubble Sort algorithm
    public static void bubbleSort(ArrayList<Integer> arr) {
        int n = arr.size();  // Gets the size of the ArrayList
        // Outer loop: goes through the list from start to second-last element
        for (int i = 0; i < n - 1; i++) {
            // Inner loop: goes through the list from the start to the unsorted part
            for (int j = 0; j < n - i - 1; j++) {
                // Compares adjacent elements
                if (arr.get(j) > arr.get(j + 1)) {
                    // Swap arr[j] and arr[j + 1] if they are in the wrong order
                    int temp = arr.get(j);  // Temporarily stores arr[j]
                    arr.set(j, arr.get(j + 1));  // Assigns arr[j + 1] to arr[j]
                    arr.set(j + 1, temp);  // Assigns the stored value of arr[j] to arr[j + 1]
                }
            }
        }
    }

    // Main method, where the program starts executing
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // Creates a scanner object for user input
        ArrayList<Integer> NumsToSort = new ArrayList<Integer>();  // Creates an ArrayList to hold the numbers to sort
        
        System.out.println("Bubble Sorting ");  // Prints a message to the console

        System.out.println("How many numbers you want to sort?");  // Asks the user for the number of elements
        int nums = scan.nextInt();  // Takes the input number from the user
        scan.nextLine();  // Clears the buffer

        // Loop to take user input for each number to be sorted
        for (int i = 1; i <= nums; i++) {

            System.out.println("Enter the number you want to sort");  // Asks the user to enter a number
            int num = scan.nextInt();  // Takes an integer input from the user
            NumsToSort.add(num);  // Adds the input number to the ArrayList

            // This block executes after the last number is entered
            if (nums == i) {

                System.out.println("Original ArrayList:");  // Prints the original list before sorting
                System.out.println(NumsToSort);  // Prints the current state of the ArrayList

                bubbleSort(NumsToSort);  // Calls the bubbleSort method to sort the ArrayList

              