import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created 26.3.2016 г..
 */
public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] words = input.nextLine().split("\\W+");
        TreeSet<String> mySet = new TreeSet<String>();
        for (int i = 0; i < words.length; i++) {
            mySet.add(words[i].toLowerCase());
        }
        //System.out.println(mySet);
        for (String s : mySet) {
            System.out.print(s);
            System.out.print(" ");
        }
    }
}
