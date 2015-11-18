import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestSequenceEqualStrings {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String[] InputLine = Scan.nextLine().split(" ");

        Map<String,Integer> MyMap = new HashMap<>();

        for (int i = 0; i < InputLine.length; i++){

            if (!MyMap.containsKey(InputLine[i])){
                MyMap.put(InputLine[i], 0);
            }

            if (MyMap.containsKey(InputLine[i])){
                MyMap.put(InputLine[i], MyMap.get(InputLine[i]) + 1);
            }
        }

        Map.Entry<String,Integer> MaxKey = null;

        for (Map.Entry<String, Integer> entry : MyMap.entrySet())
        {
            if (MaxKey == null || entry.getValue().compareTo(MaxKey.getValue()) > 0)
            {
                MaxKey = entry;
            }
    }

        for (int i = 0; i< MaxKey.getValue(); i++){
            System.out.print(MaxKey.getKey() + " ");
        }
}
}
