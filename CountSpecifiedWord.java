import java.util.*;

/**
 * Created 26.3.2016 г..
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] words = input.nextLine().split("\\W+");
        String specialWord = input.nextLine();
        Integer count = 0;
        for (String word : words) {
            if (word.equals(specialWord)){
                count++;
            }
        }
        System.out.println(count);
    }

}
