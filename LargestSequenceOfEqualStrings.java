import java.util.Scanner;

/**
 * Created 25.3.2016 г..
 */

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]arr = input.nextLine().split(" ");

        int lenght = 0;
        int bestLenght = 0;
        String number;
        number = arr[0];

        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i].equals(arr[i+1])){
                lenght++;
            }
                if (lenght > bestLenght){
                bestLenght = lenght;
                number = arr[i];
                }
            else {
                    lenght=0;
                }
        }
        System.out.println();
        for (int i = 0; i <= bestLenght; i++) {
            System.out.print(number + " ");
        }
    }
}
