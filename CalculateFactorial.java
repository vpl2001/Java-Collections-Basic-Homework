import java.util.Scanner;

/**
 * Created 26.3.2016 г..
 */
public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number N for factorial: ");
        int number = Integer.parseInt(input.next());
        System.out.println(getFactorial(number));
        }

    static long getFactorial (long a){
        if (a==1 || a==0){
            return 1;
        }
        else {
            return a*getFactorial(a-1);
        }
    }
}
