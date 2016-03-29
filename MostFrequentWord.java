import java.util.*;

/**
 * Created 26.3.2016 г..
 */

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] sentence = input.nextLine().toLowerCase().split("\\W+");

        TreeMap<String, Integer> wordsCount = new TreeMap<>();
        for (String word : sentence) {
            Integer count = wordsCount.get(word);
            if (count==null){
                count = 0;
            }
            wordsCount.put(word, count+1);
        }
        int maxValueInMap = Collections.max(wordsCount.values());
        for (Map.Entry<String,Integer> entry : wordsCount.entrySet()) {
            if (entry.getValue() == maxValueInMap){
                System.out.printf("%s -> %d times. \n", entry.getKey(), entry.getValue());
            }
        }
    }
}
