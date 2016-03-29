import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created 25.3.2016 г..
 */

public class SequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]arr = input.nextLine().split(" ");
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals(arr[i-1])){
                System.out.print(" "+ arr[i]);
            }
            else {
                System.out.println();
                System.out.print(arr[i]);
            }
        }
    }
}
