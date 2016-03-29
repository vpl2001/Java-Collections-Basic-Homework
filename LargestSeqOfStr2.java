import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created 25.3.2016 г..
 */
public class LargestSeqOfStr2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = input.nextLine().split(" ");

        List<String> largest = new ArrayList<>();
        largest.add(arr[0]);

        for (int i = 1; i < arr.length-1; i++) {
            List<String> buffer = new ArrayList<>();
            buffer.add(arr[i]);
            int k = i;
            while ((arr[k].equals(arr[k-1]) && (k < arr.length -1))) {
                buffer.add(arr[k]);
                k++;
            }
            if (buffer.size() > largest.size()) {
                largest.clear();
                for (String s : buffer) {
                    largest.add(s);
                }
            }
        }
        if (arr.length == 1) {
            largest.add(arr[0]);
        }

        for (String str : largest) {
            System.out.print(str + " ");
        }
    }
}