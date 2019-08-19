package algorithms;

import java.util.Arrays;

public class ArrayRotation {

    /**
     * Time complexity : O(n * d)
     * space complexity: O(d)
     * @param arr
     * @param d
     * @param n
     * @return
     */
    public static int[]  rotate(int arr[] ,  int d, int n){

        //create new array of size d
        int [] extractedNumbers =  new int[d];

        //save from arr into extracted numbers
        for(int i = 0; i < d; i++)
            extractedNumbers[i] = arr[i];

        //move numbers in arr upwards
        for(int i = 0; i < d; i++)
            leftRotate(arr, n);

        //add extracted numbers back to array
        for(int i = n - d, j =0; i < n; i++, j++)
            arr[i] = extractedNumbers[j];

        return arr;

    }

    /**
     * Time complexity : O(n * d)
     * Space complexity : O(1)
     * @param arr
     * @param d
     * @param n
     * @return
     */
    public static int[] rotate_algorithm_2(int arr[] ,  int d, int n){

        for(int i = 0; i < d; i++) {
            int temp = arr[0];
            leftRotateByOne(arr , n, temp);
        }
        return arr;
    }

    public static void printArray(int arr[]){
        System.out.print("[");
        for(int i : arr)
            System.out.print(i + ", ");
        System.out.println("]");
    }


    public static void leftRotate(int arr[], int n){
        for(int j = 0; j < n - 1; j++)
            arr[j] = arr[j + 1];
    }

    public static void leftRotateByOne(int arr[], int n, int temp){
        int j;
        for(j = 0; j < n - 1; j++)
            arr[j] = arr[j + 1];
        arr[j] = temp;
    }

}
