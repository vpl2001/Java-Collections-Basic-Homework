import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created 26.3.2016 г..
 */

public class CountAllWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] words = input.nextLine().split("[^A-Za-z]+");
        System.out.println(words.length);
    }
}
