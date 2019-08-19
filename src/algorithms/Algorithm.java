public class Algorithm {

    public static void main (String [] args){
        int arr[] = {1, 21, 3, 4, 5, 6, 7, 77, 2, 9, 4, 52, 6, 43};
        int d = 3, n = arr.length;

        ArrayRotation.printArray( ArrayRotation.rotate_algorithm_2(arr, d ,n) );
    }
}
