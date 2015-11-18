import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CardsFrequencies {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        char[] charArray = Scan.nextLine().toCharArray();
        double inputLeenght = 0;

        Map<Character,Integer> charMap = new LinkedHashMap<>();
        int counter = 0;

        for (int i = 0; i < charArray.length; i++) {
            Character currChar = charArray[i];

            if (!(charMap.containsKey(currChar))) {
                charMap.put(currChar, 1);

                inputLeenght++;
            }
            else {
                charMap.put(currChar, charMap.get(currChar) + 1);

                inputLeenght++;
            }

            if (currChar != '1'){
                i += 2;
            }

            else {
                i += 3;
            }

        }

        for (Map.Entry<Character,Integer> entry : charMap.entrySet()){
            double entryValue = entry.getValue();

            double frequency = (entryValue / inputLeenght)*100;

            if (entry.getKey() == '1') {
              //System.out.println(entry.getKey() +"0 -> " + frequency);
                System.out.printf("%s0 -> %.2f%%\n", entry.getKey(), frequency);
            }

            else {
                System.out.printf("%s -> %.2f%%\n", entry.getKey(), frequency);
            }
        }

        //System.out.print(charMap);
    }
}
