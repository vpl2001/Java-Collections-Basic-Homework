import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created 27.3.2016 г..
 */

public class CombineListOfLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        String[] firstLine = input.nextLine().split(" ");
        String[] secondLine = input.nextLine().split(" ");
        ArrayList<String> firstList = new ArrayList<>();
        ArrayList<String> secondList = new ArrayList<>();
        ArrayList<String> obtainedList = new ArrayList<>();

        for (int i = 0; i < firstLine.length; i++) {
            firstList.add(firstLine[i]);
        }
        for (int i = 0; i < secondLine.length; i++) {
            secondList.add(secondLine[i]);
        }

        if (firstList.contains("c")){
            for (int i = 0; i < firstList.size(); i++) {
                obtainedList.add(firstList.get(i));
            }
            for (int i = 0; i < secondList.size(); i++) {
                obtainedList.add(secondList.get(i));
            }
            for (String s : obtainedList) {
                System.out.print(s);
                System.out.print(" ");
            }
        }
        else {
            for (int i = 0; i < firstList.size(); i++) {
                obtainedList.add(firstList.get(i));
            }
            for (String s : obtainedList) {
                System.out.print(s);
                System.out.print(" ");
            }
        }
    }
}
