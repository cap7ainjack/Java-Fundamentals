import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _SumCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> inputCards = new ArrayList<>();
        inputCards.addAll(Arrays.asList(scan.nextLine().split(" ")));
        int valueOfHand = 0;

        List<Integer> cardsValues = inputCards.stream()
                .map(s -> s.substring(0,s.length()-1))
                .map(s -> s.replace("J", "12").replace("Q", "13").replace("K","14").replace("A", "15"))
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());

        for (int i = 0; i<cardsValues.size(); i++){
            valueOfHand += cardsValues.get(i);
        }

        System.out.println(valueOfHand);

    }
}
