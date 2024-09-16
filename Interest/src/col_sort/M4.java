package col_sort;
import java.util.*;

public class M4 {

    public static void printTopNFrequentWords(List<String> words, int N) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        
        entryList.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        
        for (int i = 0; i < N && i < entryList.size(); i++) {
            System.out.println(entryList.get(i).getKey() + ": " + entryList.get(i).getValue());
        }
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
            "apple", "banana", "apple", "orange", "banana", "apple", "apple",
            "banana", "orange", "banana", "apple", "banana", "orange", "orange", "grape"
        );
        
        int N = 3;
        printTopNFrequentWords(words, N);
    }
}
