import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        Map<String, Integer> myMap = new HashMap<>();

        String[] input = Scan.nextLine().toLowerCase().trim().split("\\W+");

        for (int i = 0; i < input.length; i++) {
            String currWord = input[i];

            if (!(myMap.containsKey(currWord))) {
                myMap.put(currWord, 1);
            }
            else {
                myMap.put(currWord, myMap.get(currWord) + 1);
            }
        }

        getBiggestEntry(myMap);

    }
    public static void getBiggestEntry (Map<String, Integer> myMap){
        Map.Entry<String,Integer> BiggestEntry = null;

        for (Map.Entry<String,Integer> entry : myMap.entrySet()){

            if ((BiggestEntry == null) || (entry.getValue().compareTo(BiggestEntry.getValue())) > 0){

                BiggestEntry = entry;
            }
        }
            System.out.print(BiggestEntry.getKey() + " -> " + BiggestEntry.getValue() + " times");
           // System.out.println(BiggestEntry);

    }
}


