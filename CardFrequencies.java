import java.util.*;

/**
 * Created 29.3.2016 г..
 */

public class CardFrequencies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] playCards = input.nextLine().split("\\W+");

        //get the card without suit

        //i made it with HashMap and TreeMap,
        // but I saw in another solutions the desired OUTPUT

       LinkedHashMap<String, Double> cards = new LinkedHashMap<>();
        for (String c : playCards) {
            Double count = cards.get(c);
            if (count==null){
                count = 0d;
            }
            cards.put(c, count+1);
        }

        for (Map.Entry<String, Double> element : cards.entrySet()) {

            Double appearances = element.getValue() / playCards.length *100;
            System.out.printf("%s -> %.2f%%", element.getKey(), appearances);
            System.out.println();
        }
    }
}
