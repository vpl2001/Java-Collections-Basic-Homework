import java.util.Arrays;
import java.util.Scanner;

/**
 * Created 24.3.2016 г..
 */

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter Integer number n: ");
        int n = sc.nextInt();
        System.out.println("Please, enter n numbers: ");
        int[]numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(numbers);

        for (int num:numbers) {
            System.out.print(num + " ");
        }
    }
}
