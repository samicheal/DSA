package algorithms.Searching;

public class Sorting {

    /**
     * time complexity O(squareroot(n))
     * space complexity O(1)
     */
    public static <T extends Comparable<T>> int jumpSearch(T[] array, T searchKey){
        //declare local variables
        int arraySize = array.length;
        int step = (int) Math.sqrt(Double.parseDouble(String.valueOf(arraySize)));
        int low = 0;
        int high = low + step;
        int index = -1;

        //determining bounds
        while (high <= arraySize){
            if(array[low].compareTo(searchKey) == 0) {
                index = low;
                break;
            }
            if(array[high - 1].compareTo(searchKey) == 0) {
                index = high - 1;
                break;
            }

            if (array[low].compareTo(searchKey) < 0 && array[high - 1].compareTo(searchKey) > 0){
                //frisking bounds using linear search
                for(int i = low + 1; i < high; i++) {
                    if (array[i].compareTo(searchKey) == 0) {
                        index = i;
                        break;
                    }
                }
            }

            if(index != -1)
                 break;

                low = high;
                high += step;
        }

        return index;
    }

}
