//que20- soritng

import java.util.Scanner;

public class Q20 {

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
        bubbleSort(stringArray);

        // Sorting Integer array
        bubbleSort(integerArray);

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

    // Bubble sort for String array
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Bubble sort for Integer array
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

