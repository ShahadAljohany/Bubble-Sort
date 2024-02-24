
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] arg) {
        // Sorts a given array by Bubble Sort
        //Input: An array A[0..n − 1] of orderable elemets
        //Output: Array A[0..n − 1] sorted in nondecreasing order
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length of the array  : ");
        int length = input.nextInt(); // enter the length of the array

        int[] arr = new int[length]; // craet array 

        System.out.print("\nPlease fill in the array with the number of numbers you entered : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt(); // fill in the array
        }
        BubbleSort(arr);
        System.out.print("\n Bubble Sort : [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

    }

    // sort by Bubble Sort
    public static int[] BubbleSort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = 0; j <= arr.length - 2 - i; j++) {
                
                if (arr[j + 1] < arr[j]) {
                    int swap = arr[j];
                    arr[j ] = arr[j+1];
                    arr[j +1 ] = swap;
                }

            }
        }
        return arr;
    }

}
