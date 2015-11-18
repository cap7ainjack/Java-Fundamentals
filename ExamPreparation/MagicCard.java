import java.util.*;
import java.util.stream.Collectors;

public class MagicCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] hand = scan.nextLine().split("\\s+");
        String oddEven = scan.nextLine();
        String magicCard = scan.nextLine().trim();

        HashMap<Character,Integer> specialCards = new HashMap<>();
        specialCards.put('J', 120);
        specialCards.put('Q', 130);
        specialCards.put('K', 140);
        specialCards.put('A', 150);

        int magicsum = 0;

        String magicCardValue = magicCard.replaceAll("[SHDC]", "");
        String magicCardSuit = magicCard.replaceAll("[0-9AJQK]+", "");

        int i = 0;
        if (oddEven.equals("odd")){
            i = 1;
        }

        for (; i < hand.length; i += 2){
            String card = hand[i];

            int cardValue;

            if (isSpecial(card)){
                cardValue = specialCards.get(card.charAt(0));
            }
            else {
                cardValue = Integer.parseInt(card.replaceAll("[SCHD]", ""))
                            *10;
            }

            if (card.contains(magicCardValue)){
                cardValue *= 3;
            }
            if (card.contains(magicCardSuit)){
                cardValue *= 2;
            }

            magicsum += cardValue;

        }

        System.out.println(magicsum);

    }

    public static boolean isSpecial(String card){
        return !(card.charAt(0) >= '1' && card.charAt(0) <= '9');
    }
}
