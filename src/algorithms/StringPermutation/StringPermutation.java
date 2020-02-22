package algorithms.StringPermutation;

import java.util.Map;
import java.util.TreeMap;

public class StringPermutation {

    public void permute(char input[]){
        Map<Character, Integer> countMap = new TreeMap<>();
        for(char ch : input){
            countMap.compute(ch, (key, val) -> {
                if(val == null)
                    return 1;
                else
                    return val + 1;
            });
        }

        char str[] = new char[countMap.size()];
        int count[] = new int[countMap.size()];
        int index = 0;

        for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
            str[index] = entry.getKey();
            count[index] = entry.getValue();
            index++;
        }
        char result[] = new char[input.length];
        permuteUtil();
    }

    public void permuteUtil(){

    }
}
