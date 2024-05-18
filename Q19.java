//arrays
import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for 1D array
        System.out.print("Enter the size of the 1D array: ");
        int size1D = scanner.nextInt();
        int[] oneDArray = new int[size1D];
        System.out.println("Enter the elements of the 1D array:");
        for (int i = 0; i < size1D; i++) {
            oneDArray[i] = scanner.nextInt();
        }
        System.out.println("1D Array:");
        printArray(oneDArray);

        // Input for 2D array
        System.out.print("\nEnter the number of rows for the 2D array: ");
        int rows2D = scanner.nextInt();
        System.out.print("Enter the number of columns for the 2D array: ");
        int cols2D = scanner.nextInt();
        int[][] twoDArray = new int[rows2D][cols2D];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows2D; i++) {
            for (int j = 0; j < cols2D; j++) {
                twoDArray[i][j] = scanner.nextInt();
            }
        }
        System.out.println("2D Array:");
        printArray(twoDArray);

        // Input for 3D array
        System.out.print("\nEnter the depth for the 3D array: ");
        int depth3D = scanner.nextInt();
        System.out.print("Enter the number of rows for each 3D array: ");
        int rows3D = scanner.nextInt();
        System.out.print("Enter the number of columns for each 3D array: ");
        int cols3D = scanner.nextInt();
        int[][][] threeDArray = new int[depth3D][rows3D][cols3D];
        System.out.println("Enter the elements of the 3D array:");
        for (int i = 0; i < depth3D; i++) {
            for (int j = 0; j < rows3D; j++) {
                for (int k = 0; k < cols3D; k++) {
                    threeDArray[i][j][k] = scanner.nextInt();
                }
            }
        }
        System.out.println("3D Array:");
        printArray(threeDArray);

        scanner.close();
    }

    // Method to print 1D array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to print 2D array
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to print 3D array
    public static void printArray(int[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
