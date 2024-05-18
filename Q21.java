//Q21:: SELECITON SORITNG

import java.util.Scanner;

public class Q21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for String array
        System.out.print("Enter the number of elements in the string array: ");
        int stringLength = scanner.nextInt();
        String[] stringArray = new String[stringLength];
        System.out.println("Enter the elements of the string array:");
        for (int i = 0; i < stringLength; i++) {
            stringArray[i] = scanner.next();
        }

        // Input for Integer array
        System.out.print("Enter the number of elements in the integer array: ");
        int integerLength = scanner.nextInt();
        int[] integerArray = new int[integerLength];
        System.out.println("Enter the elements of the integer array:");
        for (int i = 0; i < integerLength; i++) {
            integerArray[i] = scanner.nextInt();
        }

        // Sorting String array
        selectionSort(stringArray);

        // Sorting Integer array
        selectionSort(integerArray);

        // Display sorted String array
        System.out.println("\nSorted String Array:");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }

        // Display sorted Integer array
        System.out.println("\nSorted Integer Array:");
        for (int num : integerArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Selection sort for String array
    public static void selectionSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Selection sort for Integer array
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
