package algorithms.sets_functions_matrices;

public class Powersets_Subsets {

    public static void main(String [] args){
        char [] set = {'a', 'e', 'b', 'c'};
        printSubsets(set);
    }

    private static void printSubsets(char [] set){
        int size = set.length;
        for(int i=0; i<(1<<size); i++){
            System.out.print("{ ");

            for (int j = 0; j<size; j++){
                if ((i & (1 << j)) > 0){
                    System.out.print(set[j] + " ");
                }
            }

            System.out.println("}");
        }
    }
}
